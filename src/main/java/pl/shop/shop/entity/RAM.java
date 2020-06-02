package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ram")
public class RAM {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long ram_id;
    private String obrazek; // sciezka do obrazku
    private String nazwa;
    private String producent;
    private int rozmiar_pamieci; //np 16GB
    private int taktowanie; //np 3200
    private String typ_pamieci; //np DDR4
    private int CAS;
    private float napiecie;
    private String timingi;

    private float cena;

    @ManyToMany(mappedBy = "ram")
    @JsonBackReference
    private List<Komputer> komputer;

    public long getRam_id() {
        return ram_id;
    }

    public void setRam_id(long ram_id) {
        this.ram_id = ram_id;
    }

    public String getObrazek() {
        return obrazek;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getRozmiar_pamieci() {
        return rozmiar_pamieci;
    }

    public void setRozmiar_pamieci(int rozmiar_pamieci) {
        this.rozmiar_pamieci = rozmiar_pamieci;
    }

    public int getTaktowanie() {
        return taktowanie;
    }

    public void setTaktowanie(int taktowanie) {
        this.taktowanie = taktowanie;
    }

    public String getTyp_pamieci() {
        return typ_pamieci;
    }

    public void setTyp_pamieci(String typ_pamieci) {
        this.typ_pamieci = typ_pamieci;
    }

    public int getCAS() {
        return CAS;
    }

    public void setCAS(int CAS) {
        this.CAS = CAS;
    }

    public float getNapiecie() {
        return napiecie;
    }

    public void setNapiecie(float napiecie) {
        this.napiecie = napiecie;
    }

    public String getTimingi() {
        return timingi;
    }

    public void setTimingi(String timingi) {
        this.timingi = timingi;
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
