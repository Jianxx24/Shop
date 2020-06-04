package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.shop.shop.entity.Procesor;
import pl.shop.shop.service.ProcesorService;

import java.util.List;

@Controller
@RequestMapping("/cpu")
public class ProcesorKontroler {
    @Autowired
    private ProcesorService procesorService;

    @GetMapping(value="/all", produces="application/json")
    public ResponseEntity<List<Procesor>> getAllProcesor(){
        return ResponseEntity.ok(procesorService.findAll());
    }

    @GetMapping(value="/socket/{socket}", produces="application/json")
    public ResponseEntity<List<Procesor>> getAllProcesorBySocket(@PathVariable String socket){
        return ResponseEntity.ok(procesorService.findBySocket(socket));
    }
    @GetMapping(value="/producent/{producent}", produces="application/json")
    public ResponseEntity<List<Procesor>> getAllProcesorByProducent(@PathVariable String producent){
        return ResponseEntity.ok(procesorService.findByProducent(producent));}
    @GetMapping(value="/cores/{cores}", produces="application/json")
    public ResponseEntity<List<Procesor>> getAllProcesorByCores(@PathVariable int cores){
        return ResponseEntity.ok(procesorService.findByIloscRdzeni(cores));}
    @PostMapping("/add")
    public Procesor newProcesor(@RequestBody Procesor newProcesor) {

        return procesorService.createProcesorEntry(newProcesor);
    }
}
