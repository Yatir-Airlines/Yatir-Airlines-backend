package rw.ac.rca.smis.dao;

import java.io.Serializable;
import java.util.Set;

public interface Flight {
    Flight createFlight(Flight flight);
    Set<Flight> getFlights();
    Flight getFlight(Flight flight, Serializable id);
    Flight deleteFlight(Flight flight);
    Flight updateFlight(Flight flight);

}
