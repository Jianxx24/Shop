package pl.shop.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.shop.shop.entity.Procesor;
import pl.shop.shop.repository.ProcesorRepository;

import java.util.List;

@Service
@Component
public class ProcesorService {
    @Autowired
    private ProcesorRepository procesorRepository;

    public List<Procesor> findAll() {
        return (List<Procesor>)procesorRepository.findAll();
    }
}
