package pl.shop.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pl.shop.shop.entity.Komputer;
import pl.shop.shop.repository.KlientRepository;
import pl.shop.shop.repository.KomputerRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Component
public class KomputerService {
    @Autowired
    private KomputerRepository KomputerRepository;
    private KlientRepository klientRepository;
    public Komputer createKomputerEntry(Komputer newEntry){
        return KomputerRepository.save(newEntry);
    }
    public List<Komputer> findAll(){
        return (List<Komputer>) KomputerRepository.findAll();
    }
    public Optional<Komputer> findById(Long KlientId){
        return KomputerRepository.findById(KlientId);
    }
    public List<Komputer> findByKlientIdAndZlozone(Long KlientId, boolean zlozone){return KomputerRepository.findByKlientKlientIdAndZlozone(KlientId, zlozone);}
    public Optional<Komputer> findByKlientId(Long KlientId){return KomputerRepository.findByKlientKlientId(KlientId);}

}

