package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="koszyk")
public class Koszyk {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long koszykId;

    @OneToOne
    @JoinColumn(name = "klientId")
    private Klient klient;

    @OneToMany (mappedBy = "koszyk" , fetch = FetchType.LAZY , cascade = CascadeType.ALL )
    @JsonBackReference
    private List<Komputer> komputer;


    public List<Komputer> getKomputer() {
        return komputer;
    }

    public void setKomputer(List<Komputer> komputer) {
        this.komputer = komputer;
    }

    private boolean ukonczone;

    public long getKoszykId() {
        return koszykId;
    }

    public void setKoszykId(long koszykId) {
        this.koszykId = koszykId;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public boolean isUkonczone() {
        return ukonczone;
    }

    public void setUkonczone(boolean ukonczone) {
        this.ukonczone = ukonczone;
    }
}
