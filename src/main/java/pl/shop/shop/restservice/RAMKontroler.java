package pl.shop.shop.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.shop.shop.entity.RAM;
import pl.shop.shop.service.RAMService;

import java.util.List;


@RestController
@RequestMapping("/ram")
public class RAMKontroler {
    @Autowired
    private RAMService ramService;
    @GetMapping(value="/all", produces="application/json")
    public ResponseEntity<List<RAM>> findAll() {
        return ResponseEntity.ok((List<RAM>) ramService.findAll());
    }
    @GetMapping(value="/type/{type}", produces="application/json")
    public ResponseEntity<List<RAM>> findByTyp(@PathVariable String type){
        return ResponseEntity.ok((List<RAM>) ramService.findByTyp(type));
    }
    @GetMapping(value="/clock/{clock}", produces="application/json")
    public ResponseEntity<List<RAM>> findByTaktowanie(@PathVariable int clock){
        return ResponseEntity.ok((List<RAM>) ramService.findByTaktowanie(clock));
    }
    @GetMapping(value="/memory/{memory}", produces="application/json")
    public ResponseEntity<List<RAM>> findByRozmiarPamieci(@PathVariable int memory){
        return ResponseEntity.ok((List<RAM>) ramService.findByRozmiarPamieci(memory));
    }
    @GetMapping(value="/type/{type}/clock/{clock}", produces="application/json")
    public ResponseEntity<List<RAM>> findByTypPamieciAndTaktowanie(@PathVariable String type, @PathVariable int clock){
        return ResponseEntity.ok((List<RAM>) ramService.findByTypPamieciAndTaktowanie(type,clock));
    }
    @GetMapping(value="/type/{type}/clock/{clock}/memory/{memory}", produces="application/json")
    public ResponseEntity<List<RAM>> findByTypPamieciAndTaktowanieAndPamiec(@PathVariable String type, @PathVariable int clock, @PathVariable int memory){
        return ResponseEntity.ok((List<RAM>) ramService.findByTypPamieciAndTaktowanieAndRozmiarPamieci(type,clock, memory));
    }
}
