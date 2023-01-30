package rw.ac.rca.smis.orm;



import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name="airline")
public class Airline {
    public int getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Name;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "airline")
    private Set<Flight> flights;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }

}
