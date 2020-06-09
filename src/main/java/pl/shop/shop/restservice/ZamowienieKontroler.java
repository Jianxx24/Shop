package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.shop.shop.entity.Komputer;
import pl.shop.shop.entity.Koszyk;
import pl.shop.shop.entity.Zamowienie;
import pl.shop.shop.service.KlientService;
import pl.shop.shop.service.KomputerService;
import pl.shop.shop.service.KoszykService;
import pl.shop.shop.service.ZamowienieService;

import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/zamowienia")
public class ZamowienieKontroler {
    @Autowired
    ZamowienieService zamowienieService;
    @Autowired
    KoszykService koszykService;
    @Autowired
    KlientService klientService;
    @Autowired
    KomputerService komputerService;

    @PostMapping(value="/dodaj")
    public String addOrder(HttpSession session, Model model){
        Long klientId = (Long) session.getAttribute("klientId");
        if (klientId != null){
            Koszyk koszyk=koszykService.findByKlientId(klientId).get();

            List<Komputer> komputers = koszyk.getKomputer();
            List<Komputer> komps = new ArrayList<Komputer>();
            for (Komputer komputer:komputers
                 ) {if(komputer.isZlozone() && komputer.getKlient().getKlientId()==klientId)komps.add(komputer);

            }
            Date data = new Date();
            Zamowienie zamowienie = new Zamowienie();
            zamowienie.setKomputerList(komps);
            zamowienie.setDataZamowienia(data);
            zamowienie.setKlient(klientService.findById(klientId).get());
            zamowienieService.createZamowienie(zamowienie);
            for (Komputer komp:komps)
            {
                komp.setZamowienie(zamowienie);
                komp.setKoszyk(null);
                komputerService.createKomputerEntry(komp);
            }
            return "redirect:/zamowienia/list";

        }
        return "redirect:/logowanie";
    }

    @GetMapping(value = "/list")
    public String getOrderCart(HttpSession session, Model model){


        Long klientId = (Long) session.getAttribute("klientId");
        if (klientId != null) {
            if (klientService.findById(klientId).get().isAdmin()) model.addAttribute("zamowienia", zamowienieService.findAll());
            else model.addAttribute("zamowienia", zamowienieService.findAllByKlientId(klientId));

            return "zamowienia";
        }

        return "redirect:/logowanie";
    }

    @GetMapping(value="/rest/{id}")
    public ResponseEntity<Zamowienie> findAllByKlientId(@RequestParam(value="id") Long id){
        return (ResponseEntity<Zamowienie>) zamowienieService.findAllByKlientId(id);
    }
}
