package rw.ac.rca.smis.dao;

import rw.ac.rca.smis.orm.Flight;

import java.io.Serializable;
import java.util.Set;

public interface FlightDao {
    Flight createFlight(Flight flight);
    Set<Flight> getFlights();
    Flight getFlight(Flight flight, Serializable id);
    Flight deleteFlight(Flight flight);
    Flight updateFlight(Flight flight);
}
