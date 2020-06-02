package pl.shop.shop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="koszyk")
public class Koszyk {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long koszyk_id;

    @OneToOne
    @JoinColumn(name = "klient_id")
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

    public long getKoszyk_id() {
        return koszyk_id;
    }

    public void setKoszyk_id(long koszyk_id) {
        this.koszyk_id = koszyk_id;
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
