package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.shop.shop.entity.Klient;
import pl.shop.shop.entity.Koszyk;
import pl.shop.shop.service.KlientService;
import pl.shop.shop.service.KoszykService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/koszyk")
public class KoszykKontroler {
    @Autowired
    private KoszykService koszykService;

    @Autowired
    private KlientService klientService;

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<Koszyk>> getAllCarts(){
        return ResponseEntity.ok(koszykService.findAll());
    }
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Koszyk> getCartById(@PathVariable Long id){
        Optional<Koszyk> koszyk = koszykService.findById(id);
        return ResponseEntity.ok(koszyk.get());
    }













}
