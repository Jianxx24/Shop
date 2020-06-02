package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="karta_graficzna")
public class Karta_Graficzna {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long karta_graficzna_id;
    private String obrazek; // sciezka do obrazku
    private String producent;
    private String nazwa;
    private int rozmiar_pamieci; // w MB
    private String typ_pamieci;
    private int taktowanie_procesora; //w MHZ
    private int taktowanie_pamieci; //w MHZ
    private String interfejs; //PCIe x16 join do płyty
    private float dlugosc; //do obudowy w mm
    private int TDP; // w Watach
    private String zasilanie_zewnetrzne;


    private float cena;
    @OneToMany (mappedBy = "karta_graficzna" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    public long getKarta_graficzna_id() {
        return karta_graficzna_id;
    }

    public void setKarta_graficzna_id(long karta_graficzna_id) {
        this.karta_graficzna_id = karta_graficzna_id;
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

    public int getRozmiar_pamieci() {
        return rozmiar_pamieci;
    }

    public void setRozmiar_pamieci(int rozmiar_pamieci) {
        this.rozmiar_pamieci = rozmiar_pamieci;
    }

    public String getTyp_pamieci() {
        return typ_pamieci;
    }

    public void setTyp_pamieci(String typ_pamieci) {
        this.typ_pamieci = typ_pamieci;
    }

    public int getTaktowanie_procesora() {
        return taktowanie_procesora;
    }

    public void setTaktowanie_procesora(int taktowanie_procesora) {
        this.taktowanie_procesora = taktowanie_procesora;
    }

    public int getTaktowanie_pamieci() {
        return taktowanie_pamieci;
    }

    public void setTaktowanie_pamieci(int taktowanie_pamieci) {
        this.taktowanie_pamieci = taktowanie_pamieci;
    }

    public String getInterfejs() {
        return interfejs;
    }

    public void setInterfejs(String interfejs) {
        this.interfejs = interfejs;
    }

    public float getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(float dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getTDP() {
        return TDP;
    }

    public void setTDP(int TDP) {
        this.TDP = TDP;
    }

    public String getZasilanie_zewnetrzne() {
        return zasilanie_zewnetrzne;
    }

    public void setZasilanie_zewnetrzne(String zasilanie_zewnetrzne) {
        this.zasilanie_zewnetrzne = zasilanie_zewnetrzne;
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
