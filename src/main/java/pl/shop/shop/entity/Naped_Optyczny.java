package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="naped_optyczny")
public class Naped_Optyczny {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long naped_optyczny_id;
    private String obrazek; // sciezka do obrazku
    private String producent;
    private String nazwa;
    private String interfejs;
    private float typ_ksztaltu; //np 5.25 cala
    private int cache;
    private int szybkosc;

    private float cena;
    @OneToMany (mappedBy = "naped_optyczny" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    public long getNaped_optyczny_id() {
        return naped_optyczny_id;
    }

    public void setNaped_optyczny_id(long naped_optyczny_id) {
        this.naped_optyczny_id = naped_optyczny_id;
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

    public String getInterfejs() {
        return interfejs;
    }

    public void setInterfejs(String interfejs) {
        this.interfejs = interfejs;
    }

    public float getTyp_ksztaltu() {
        return typ_ksztaltu;
    }

    public void setTyp_ksztaltu(float typ_ksztaltu) {
        this.typ_ksztaltu = typ_ksztaltu;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public int getSzybkosc() {
        return szybkosc;
    }

    public void setSzybkosc(int szybkosc) {
        this.szybkosc = szybkosc;
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
