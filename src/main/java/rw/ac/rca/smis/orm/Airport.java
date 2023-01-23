package rw.ac.rca.smis.orm;

import java.util.Set;

public class Airport {
    private String Name;
    private int code;
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