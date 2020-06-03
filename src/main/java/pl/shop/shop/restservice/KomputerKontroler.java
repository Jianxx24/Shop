package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pl.shop.shop.entity.Komputer;
import pl.shop.shop.service.KomputerService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/komputer")
public class KomputerKontroler {
    @Autowired
    private KomputerService KomputerService;



    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<Komputer>> getAllKomputer() {
        return ResponseEntity.ok(KomputerService.findAll());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Komputer> getKomputerById(@PathVariable Long id) {
        Optional<Komputer> Komputer = KomputerService.findById(id);
        return ResponseEntity.ok(Komputer.get());
    }

    @GetMapping(value = "/zlozone/{klientid}", produces = "application/json")
    public ResponseEntity<List<Komputer>> getKomputerByKlientIdZlozone(@PathVariable Long klientid) {
        List<Komputer> komputery = KomputerService.findByKlientIdAndZlozone(klientid, true);

        return ResponseEntity.ok(komputery);
    }

    @GetMapping(value = "/twojkomputer/{klientid}", produces = "application/json")
    public ResponseEntity<List<Komputer>> getKomputerForKlient(@PathVariable Long klientid) {
        List<Komputer> komputery = KomputerService.findByKlientIdAndZlozone(klientid, true);
        komputery.get(0);


        return ResponseEntity.ok(komputery);
    }



    @GetMapping(value = "/niezlozone/{klientid}", produces = "application/json")
    public ResponseEntity<List<Komputer>> getKomputerByKlientNiezlozone(@PathVariable Long klientid) {
        List<Komputer> komputery = KomputerService.findByKlientIdAndZlozone(klientid, false);

        return ResponseEntity.ok(komputery);
    }





    @PostMapping("/add")
    public Komputer newKomputer(@RequestBody Komputer newKomputer) {

        return KomputerService.createKomputerEntry(newKomputer);
    }







}