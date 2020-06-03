package pl.shop.shop.repository;

import org.springframework.data.repository.CrudRepository;
import pl.shop.shop.entity.Komputer;

import java.util.List;


public interface KomputerRepository extends CrudRepository<Komputer, Long> {

List<Komputer> findByKlientKlientIdAndZlozone(Long klientId, boolean zlozone);
}