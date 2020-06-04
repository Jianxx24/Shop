package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.shop.shop.entity.PlytaGlowna;
import pl.shop.shop.service.PlytaGlownaService;

import java.util.List;

@Controller
@RequestMapping("/mobo")
public class PlytaGlownaKontroler {
    @Autowired
    private PlytaGlownaService plytaGlownaService;

    @GetMapping(value="/all", produces="application/json")
    ResponseEntity<List<PlytaGlowna>> findAll(){
        return ResponseEntity.ok(plytaGlownaService.findAll());
    }
    @GetMapping(value="/socket/{socket}", produces="application/json")
    ResponseEntity<List<PlytaGlowna>> findBySocket(@PathVariable String socket){
        return ResponseEntity.ok(plytaGlownaService.findBySocket(socket));
    }
}
