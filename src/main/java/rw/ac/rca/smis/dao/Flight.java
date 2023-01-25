package rw.ac.rca.smis.dao;

import java.io.Serializable;
import java.util.Set;

public interface Flight {
    Flight getFlight(Flight flight, Serializable id);
    Set<Flight> getFlights();
    Flight deleteFlight(Flight flight);
    Flight updateFlight(Flight flight);
<<<<<<< HEAD
    Flight createFlight(Flight flight);
=======
<<<<<<< HEAD
=======
    Flight createFlight(Flight flight);

>>>>>>> c442863 (some modification)

>>>>>>> 8a24e39 (working on request)
}
