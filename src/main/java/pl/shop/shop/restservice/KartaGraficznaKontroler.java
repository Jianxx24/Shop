package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.shop.shop.entity.KartaGraficzna;
import pl.shop.shop.service.KartaGraficznaService;

import java.util.List;

@Controller
@RequestMapping("/gpu")
public class KartaGraficznaKontroler {
    @Autowired
    private KartaGraficznaService kartaGraficznaService;

    @GetMapping(value="/all", produces = "application/json")
    ResponseEntity<List<KartaGraficzna>> findAll(){
        return ResponseEntity.ok(kartaGraficznaService.findAll());
    }
    @GetMapping(value="/memory/{memory}", produces = "application/json")
    ResponseEntity<List<KartaGraficzna>> findByMemory(@PathVariable String memory){
        return ResponseEntity.ok(kartaGraficznaService.findByMemory(memory));
    }
    @GetMapping(value="/producent/{producent}", produces = "application/json")
    ResponseEntity<List<KartaGraficzna>> findByProducent(@PathVariable String producent){
        return ResponseEntity.ok(kartaGraficznaService.findByProducent(producent));
    }
    @GetMapping(value="/length/{length}", produces = "application/json")
    ResponseEntity<List<KartaGraficzna>> findByDlugosc(@PathVariable float dlugosc){
        return ResponseEntity.ok(kartaGraficznaService.findByDlugosc(dlugosc));
    }
    @PostMapping("/add")
    public KartaGraficzna newKartaGraficzna(@RequestBody KartaGraficzna newKartaGraficzna) {

        return kartaGraficznaService.createKartaGraficznaEntry(newKartaGraficzna);
    }
}
