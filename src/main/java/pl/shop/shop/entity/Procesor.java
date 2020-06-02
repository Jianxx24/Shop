package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="procesor")
public class Procesor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long procesor_id;
    private String obrazek; // sciezka do obrazku
    private String producent;
    private String nazwa;
    private String socket; // tu join z procesorem
    private int ilosc_rdzeni;
    private float taktowanie;
    private int TDP; // zliczane do wyboru zasilacza
    private int maks_pamiec; // tego ram nie może przekroczyć
    private String L1_Cache;
    private String L2_Cache;
    private String L3_Cache;
    private String technologia;

    private float cena;

    @OneToMany (mappedBy = "procesor" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    public long getProcesor_id() {
        return procesor_id;
    }

    public void setProcesor_id(long procesor_id) {
        this.procesor_id = procesor_id;
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getIlosc_rdzeni() {
        return ilosc_rdzeni;
    }

    public void setIlosc_rdzeni(int ilosc_rdzeni) {
        this.ilosc_rdzeni = ilosc_rdzeni;
    }

    public float getTaktowanie() {
        return taktowanie;
    }

    public void setTaktowanie(float taktowanie) {
        this.taktowanie = taktowanie;
    }

    public int getTDP() {
        return TDP;
    }

    public void setTDP(int TDP) {
        this.TDP = TDP;
    }

    public int getMaks_pamiec() {
        return maks_pamiec;
    }

    public void setMaks_pamiec(int maks_pamiec) {
        this.maks_pamiec = maks_pamiec;
    }

    public String getL1_Cache() {
        return L1_Cache;
    }

    public void setL1_Cache(String l1_Cache) {
        L1_Cache = l1_Cache;
    }

    public String getL2_Cache() {
        return L2_Cache;
    }

    public void setL2_Cache(String l2_Cache) {
        L2_Cache = l2_Cache;
    }

    public String getL3_Cache() {
        return L3_Cache;
    }

    public void setL3_Cache(String l3_Cache) {
        L3_Cache = l3_Cache;
    }

    public String getTechnologia() {
        return technologia;
    }

    public void setTechnologia(String technologia) {
        this.technologia = technologia;
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
