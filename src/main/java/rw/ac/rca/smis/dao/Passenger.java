package rw.ac.rca.smis.dao;


import java.util.List;
import java.util.Set;

public interface Passenger {
    public Passenger getPassenger(int passengerId);

    public List<Passenger> getPassengers();

    public Passenger updatePassenger(Passenger passenger);

    public Passenger deletePassenger(int passengerId);

    public Passenger createPassenger(Passenger passenger);


}
