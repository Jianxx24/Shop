package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import pl.shop.shop.entity.Klient;
import pl.shop.shop.entity.Komputer;
import pl.shop.shop.entity.RAM;
import pl.shop.shop.service.KlientService;
import pl.shop.shop.service.KomputerService;


import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/komputer")
public class KomputerKontroler {
    @Autowired
    private KomputerService KomputerService;
    @Autowired
    private KlientService klientService;


    @GetMapping(value = "/rest/all", produces = "application/json")
    public ResponseEntity<List<Komputer>> getAllKomputer() {
        return ResponseEntity.ok(KomputerService.findAll());
    }

    @GetMapping(value = "/rest/{id}", produces = "application/json")
    public ResponseEntity<Komputer> getKomputerById(@PathVariable Long id) {
        Optional<Komputer> Komputer = KomputerService.findById(id);
        return ResponseEntity.ok(Komputer.get());
    }


    @GetMapping(value = "/rest/zlozone/{klientid}", produces = "application/json")
    public ResponseEntity<List<Komputer>> getKomputerByKlientIdZlozone(@PathVariable Long klientid) {
        List<Komputer> komputery = KomputerService.findByKlientIdAndZlozone(klientid, true);

        return ResponseEntity.ok(komputery);
    }

    @GetMapping(value = "/rest/niezlozone/{klientid}", produces = "application/json")
    public ResponseEntity<List<Komputer>> getKomputerForKlient(@PathVariable Long klientid) {
        List<Komputer> komputery = KomputerService.findByKlientIdAndZlozone(klientid, false);



        return ResponseEntity.ok(komputery);
    }

    @GetMapping(value = "/skladanie", produces = "application/json")
    public String getKomputerForKlientTemplate( Model model, HttpSession session) {
        Long klientid = (Long) session.getAttribute("klientId");
        if (klientid != null) {
            List<Komputer> komputery = KomputerService.findByKlientIdAndZlozone(klientid, false);
            Komputer komputer;

            if (!komputery.isEmpty()) {
                komputer = komputery.get(0);

                List<RAM> ram = komputer.getRam();


            } else {
                komputer = new Komputer();
                Optional<Klient> klient = klientService.findById(klientid);
                komputer.setKlient(klient.get());
                komputer.setZlozone(false);

                KomputerService.createKomputerEntry(komputer);


            }
            List<RAM> ram = komputer.getRam();
            model.addAttribute("komputer", komputer);
            model.addAttribute("ram", ram);
            return "komputer";

        }
        return "index";
    }

    @RequestMapping(value = "/skladanie/usundysk", method = RequestMethod.POST)
    public String usunDysk(@RequestParam(value = "komputerId") Long komputerId, Model model){

       Komputer komputer = KomputerService.findById(komputerId).get();
       komputer.setDysk(null);
       KomputerService.createKomputerEntry(komputer);

        model.addAttribute("komputer", komputer);
        return "redirect:/komputer/skladanie";
    }









    @PostMapping("/add")
    public Komputer newKomputer(@RequestBody Komputer newKomputer) {

        return KomputerService.createKomputerEntry(newKomputer);
    }







}