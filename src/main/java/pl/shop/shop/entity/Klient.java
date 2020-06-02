package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="klient")
public class Klient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long klient_id;
    private String imie;
    private String nazwisko;
    private String adres;
    private String miasto;
    private String nr_karta_kredytowa;
    private String username;
    private String password;

    @OneToMany (mappedBy = "klient" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    @OneToOne(mappedBy = "klient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private Koszyk koszyk;


    public long getKlient_id() {
        return klient_id;
    }

    public void setKlient_id(long klient_id) {
        this.klient_id = klient_id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getNr_karta_kredytowa() {
        return nr_karta_kredytowa;
    }

    public void setNr_karta_kredytowa(String nr_karta_kredytowa) {
        this.nr_karta_kredytowa = nr_karta_kredytowa;
    }

    public List<Komputer> getKomputer() {
        return komputer;
    }

    public void setKomputer(List<Komputer> komputer) {
        this.komputer = komputer;
    }

    public Koszyk getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(Koszyk koszyk) {
        this.koszyk = koszyk;
    }
}
