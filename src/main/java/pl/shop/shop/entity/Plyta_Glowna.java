package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="plyta_glowna")
public class Plyta_Glowna {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long plyta_glowna_id;
    private String obrazek; // sciezka do obrazku
    private String producent;
    private String nazwa;
    private String socket; // join z procesorem
    private String typ_ksztaltu; //np ATX, microATX, join z obudową
    private String chipset;
    private String typ_pamieci; //np DDR4, join z ramem
    private int sloty_pamieci; // np. 2, nie można przekroczyć przy dodawaniu
    private int max_obslugowana_ilosc_pamieci; //też ilość ramu nie może przekroczyć
    private String obslugiwane_szybkosci_pamieci;
    private int sloty_PCI_E_x16;
    private int sloty_PCI_E_x8;
    private int sloty_PCI_E_x4;
    private int sloty_PCI_E_x1;
    private int sloty_mSata; // tu przy wyborze dysków
    private int sloty_SATA6Gb; // tu przy wyborze dysków
    private int sloty_m_2;
    private int wejscia_USB20;
    private int wejscia_USB30;


    private float cena;

    @OneToMany (mappedBy = "plyta_glowna" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;

    public long getPlyta_glowna_id() {
        return plyta_glowna_id;
    }

    public void setPlyta_glowna_id(long plyta_glowna_id) {
        this.plyta_glowna_id = plyta_glowna_id;
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

    public String getTyp_ksztaltu() {
        return typ_ksztaltu;
    }

    public void setTyp_ksztaltu(String typ_ksztaltu) {
        this.typ_ksztaltu = typ_ksztaltu;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getTyp_pamieci() {
        return typ_pamieci;
    }

    public void setTyp_pamieci(String typ_pamieci) {
        this.typ_pamieci = typ_pamieci;
    }

    public int getSloty_pamieci() {
        return sloty_pamieci;
    }

    public void setSloty_pamieci(int sloty_pamieci) {
        this.sloty_pamieci = sloty_pamieci;
    }

    public int getMax_obslugowana_ilosc_pamieci() {
        return max_obslugowana_ilosc_pamieci;
    }

    public void setMax_obslugowana_ilosc_pamieci(int max_obslugowana_ilosc_pamieci) {
        this.max_obslugowana_ilosc_pamieci = max_obslugowana_ilosc_pamieci;
    }

    public String getObslugiwane_szybkosci_pamieci() {
        return obslugiwane_szybkosci_pamieci;
    }

    public void setObslugiwane_szybkosci_pamieci(String obslugiwane_szybkosci_pamieci) {
        this.obslugiwane_szybkosci_pamieci = obslugiwane_szybkosci_pamieci;
    }

    public int getSloty_PCI_E_x16() {
        return sloty_PCI_E_x16;
    }

    public void setSloty_PCI_E_x16(int sloty_PCI_E_x16) {
        this.sloty_PCI_E_x16 = sloty_PCI_E_x16;
    }

    public int getSloty_PCI_E_x8() {
        return sloty_PCI_E_x8;
    }

    public void setSloty_PCI_E_x8(int sloty_PCI_E_x8) {
        this.sloty_PCI_E_x8 = sloty_PCI_E_x8;
    }

    public int getSloty_PCI_E_x4() {
        return sloty_PCI_E_x4;
    }

    public void setSloty_PCI_E_x4(int sloty_PCI_E_x4) {
        this.sloty_PCI_E_x4 = sloty_PCI_E_x4;
    }

    public int getSloty_PCI_E_x1() {
        return sloty_PCI_E_x1;
    }

    public void setSloty_PCI_E_x1(int sloty_PCI_E_x1) {
        this.sloty_PCI_E_x1 = sloty_PCI_E_x1;
    }

    public int getSloty_mSata() {
        return sloty_mSata;
    }

    public void setSloty_mSata(int sloty_mSata) {
        this.sloty_mSata = sloty_mSata;
    }

    public int getSloty_SATA6Gb() {
        return sloty_SATA6Gb;
    }

    public void setSloty_SATA6Gb(int sloty_SATA6Gb) {
        this.sloty_SATA6Gb = sloty_SATA6Gb;
    }

    public int getSloty_m_2() {
        return sloty_m_2;
    }

    public void setSloty_m_2(int sloty_m_2) {
        this.sloty_m_2 = sloty_m_2;
    }

    public int getWejscia_USB20() {
        return wejscia_USB20;
    }

    public void setWejscia_USB20(int wejscia_USB20) {
        this.wejscia_USB20 = wejscia_USB20;
    }

    public int getWejscia_USB30() {
        return wejscia_USB30;
    }

    public void setWejscia_USB30(int wejscia_USB30) {
        this.wejscia_USB30 = wejscia_USB30;
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
