package pl.shop.shop.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="komputer")
public class Komputer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long komputer_id;
    private boolean zlozone; // czy wszystkie czesci sa, jak tak to mozna dodac do koszyka

    @ManyToOne
    @JoinColumn(name ="klient_id")
    private Klient klient;

    @ManyToOne
    @JoinColumn(name ="koszyk_id", nullable = true)
    private Koszyk koszyk;


    @ManyToOne
    @JoinColumn(name ="plyta_glowna_id", nullable = true)
    private Plyta_Glowna plyta_glowna;

    @ManyToOne
    @JoinColumn(name ="procesor_id", nullable = true)
    private Procesor procesor;


    @ManyToMany
    @JoinTable(
            name = "komputer_ram",
            joinColumns = @JoinColumn(name = "komputer_id"),
            inverseJoinColumns = @JoinColumn(name = "ram_id")
    )
    private List<RAM> ram;

    @ManyToOne
    @JoinColumn(name ="zasilacz_id", nullable = true)
    private Zasilacz zasilacz;

    @ManyToOne
    @JoinColumn(name ="dysk_id", nullable = true)
    private Dysk dysk;

    @ManyToOne
    @JoinColumn(name ="karta_graficzna_id", nullable = true)
    private Karta_Graficzna karta_graficzna;

    @ManyToOne
    @JoinColumn(name ="naped_optyczny_id", nullable = true)
    private Naped_Optyczny naped_optyczny;

    @ManyToOne
    @JoinColumn(name ="obudowa_id", nullable = true)
    private Obudowa obudowa;

    public long getKomputer_id() {
        return komputer_id;
    }

    public void setKomputer_id(long komputer_id) {
        this.komputer_id = komputer_id;
    }

    public boolean isZlozone() {
        return zlozone;
    }

    public void setZlozone(boolean zlozone) {
        this.zlozone = zlozone;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Koszyk getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(Koszyk koszyk) {
        this.koszyk = koszyk;
    }

    public Plyta_Glowna getPlyta_glowna() {
        return plyta_glowna;
    }

    public void setPlyta_glowna(Plyta_Glowna plyta_glowna) {
        this.plyta_glowna = plyta_glowna;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public List<RAM> getRam() {
        return ram;
    }

    public void setRam(List<RAM> ram) {
        this.ram = ram;
    }

    public Zasilacz getZasilacz() {
        return zasilacz;
    }

    public void setZasilacz(Zasilacz zasilacz) {
        this.zasilacz = zasilacz;
    }

    public Dysk getDysk() {
        return dysk;
    }

    public void setDysk(Dysk dysk) {
        this.dysk = dysk;
    }

    public Karta_Graficzna getKarta_graficzna() {
        return karta_graficzna;
    }

    public void setKarta_graficzna(Karta_Graficzna karta_graficzna) {
        this.karta_graficzna = karta_graficzna;
    }

    public Naped_Optyczny getNaped_optyczny() {
        return naped_optyczny;
    }

    public void setNaped_optyczny(Naped_Optyczny naped_optyczny) {
        this.naped_optyczny = naped_optyczny;
    }

    public Obudowa getObudowa() {
        return obudowa;
    }

    public void setObudowa(Obudowa obudowa) {
        this.obudowa = obudowa;
    }
}
