package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="obudowa")
public class Obudowa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long obudowa_id;
    private String obrazek; // sciezka do obrazku
    private String producent;
    private String nazwa;
    private String kolor;
    private String typ_ksztaltu; // ATX, microATX
    private float max_dlugosc_grafiki; // tu też trzeba uważać xd np 280.3mm
    private int sloty_2_5_cala;
    private int sloty_3_5_cala;

    private float cena;
    @OneToMany (mappedBy = "obudowa" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    public long getObudowa_id() {
        return obudowa_id;
    }

    public void setObudowa_id(long obudowa_id) {
        this.obudowa_id = obudowa_id;
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

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getTyp_ksztaltu() {
        return typ_ksztaltu;
    }

    public void setTyp_ksztaltu(String typ_ksztaltu) {
        this.typ_ksztaltu = typ_ksztaltu;
    }

    public float getMax_dlugosc_grafiki() {
        return max_dlugosc_grafiki;
    }

    public void setMax_dlugosc_grafiki(float max_dlugosc_grafiki) {
        this.max_dlugosc_grafiki = max_dlugosc_grafiki;
    }

    public int getSloty_2_5_cala() {
        return sloty_2_5_cala;
    }

    public void setSloty_2_5_cala(int sloty_2_5_cala) {
        this.sloty_2_5_cala = sloty_2_5_cala;
    }

    public int getSloty_3_5_cala() {
        return sloty_3_5_cala;
    }

    public void setSloty_3_5_cala(int sloty_3_5_cala) {
        this.sloty_3_5_cala = sloty_3_5_cala;
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
