package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="dysk")
public class Dysk {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long dysk_id;
    private String obrazek; // sciezka do obrazku
    private String producent;
    private String nazwa;
    private float pojemnosc; // 2tb
    private String typ; //7200rpm lub SSD
    private int cache; // w mb
    private String wspolczynnik_ksztaltu; // np. 3.5 cala join z obudową
    private String interfejs; // np SATA 6Gb, albo mSata join z plytą główną



    private float cena;
    @OneToMany (mappedBy = "dysk" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    public long getDysk_id() {
        return dysk_id;
    }

    public void setDysk_id(long dysk_id) {
        this.dysk_id = dysk_id;
    }

    public String getObrazek() {
        return obrazek;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public float getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(float pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public String getWspolczynnik_ksztaltu() {
        return wspolczynnik_ksztaltu;
    }

    public void setWspolczynnik_ksztaltu(String wspolczynnik_ksztaltu) {
        this.wspolczynnik_ksztaltu = wspolczynnik_ksztaltu;
    }

    public String getInterfejs() {
        return interfejs;
    }

    public void setInterfejs(String interfejs) {
        this.interfejs = interfejs;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public List<Komputer> getKomputer() {
        return komputer;
    }

    public void setKomputer(List<Komputer> komputer) {
        this.komputer = komputer;
    }
}
