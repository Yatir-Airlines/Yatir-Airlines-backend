package rw.ac.rca.smis.orm;

import java.util.Set;

public class Airline {
    private String Name;
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
