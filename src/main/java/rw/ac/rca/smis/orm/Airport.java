package rw.ac.rca.smis.orm;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="airport")
public class Airport {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String  Name;
    private int code;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "airport")
    private Set<Flight> flights;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }
}