package pl.shop.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.shop.shop.entity.RAM;
import pl.shop.shop.repository.RAMRepository;

import java.util.List;

@Service
@Component
public class RAMService {
    @Autowired
    private RAMRepository ramRepository;

    public List<RAM> findByTyp(String type) {
        return ramRepository.findByTypPamieciIgnoreCase(type);
    }

    public List<RAM> findAll() {
        return (List<RAM>) ramRepository.findAll();
    }

    public List<RAM> findByTaktowanie(int clock) {
        return ramRepository.findByTaktowanie(clock);
    }

    public List<RAM> findByRozmiarPamieci(int memory) {
        return ramRepository.findByRozmiarPamieci(memory);
    }

    public List<RAM> findByTypPamieciAndTaktowanie(String type, int clock) {
        return ramRepository.findByTypPamieciIgnoreCaseAndTaktowanie(type, clock);
    }

    public List<RAM> findByTypPamieciAndTaktowanieAndRozmiarPamieci(String type, int clock, int memory) {
        return ramRepository.findByTypPamieciIgnoreCaseAndTaktowanieAndRozmiarPamieci(type, clock, memory);
    }

    public RAM createRAMEntry(RAM newRAM) {
        return ramRepository.save(newRAM);
    }
}
