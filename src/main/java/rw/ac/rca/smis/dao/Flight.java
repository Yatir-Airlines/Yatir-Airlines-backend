package rw.ac.rca.smis.dao;

import java.io.Serializable;
import java.util.Set;

public interface Flight {
    Flight getFlight(Flight flight, Serializable id);
    Set<Flight> getFlights();
    Flight deleteFlight(Flight flight);
    Flight updateFlight(Flight flight);
    Flight createFlight(Flight flight);
}
