package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="zasilacz")
public class Zasilacz {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long zasilacz_id;
    private String obrazek; // sciezka do obrazku
    private String producent;
    private String nazwa;
    private String typ_ksztaltu;
    private int moc; // musi być większe niż grafika + procesor
    private int zlacza_eps;
    private int zlacza_pcie6_plus_2;
    private int zlacza_SATA;
    private int zlacza_molex_4_pin;

    private float cena;

    @OneToMany (mappedBy = "zasilacz" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    public long getZasilacz_id() {
        return zasilacz_id;
    }

    public void setZasilacz_id(long zasilacz_id) {
        this.zasilacz_id = zasilacz_id;
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

    public String getTyp_ksztaltu() {
        return typ_ksztaltu;
    }

    public void setTyp_ksztaltu(String typ_ksztaltu) {
        this.typ_ksztaltu = typ_ksztaltu;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public int getZlacza_eps() {
        return zlacza_eps;
    }

    public void setZlacza_eps(int zlacza_eps) {
        this.zlacza_eps = zlacza_eps;
    }

    public int getZlacza_pcie6_plus_2() {
        return zlacza_pcie6_plus_2;
    }

    public void setZlacza_pcie6_plus_2(int zlacza_pcie6_plus_2) {
        this.zlacza_pcie6_plus_2 = zlacza_pcie6_plus_2;
    }

    public int getZlacza_SATA() {
        return zlacza_SATA;
    }

    public void setZlacza_SATA(int zlacza_SATA) {
        this.zlacza_SATA = zlacza_SATA;
    }

    public int getZlacza_molex_4_pin() {
        return zlacza_molex_4_pin;
    }

    public void setZlacza_molex_4_pin(int zlacza_molex_4_pin) {
        this.zlacza_molex_4_pin = zlacza_molex_4_pin;
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
