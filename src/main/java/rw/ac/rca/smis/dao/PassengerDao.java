package rw.ac.rca.smis.dao;


import rw.ac.rca.smis.orm.Passenger;

import java.util.List;

public interface PassengerDao {
    public Passenger getPassenger(int passengerId);

    public List<Passenger> getPassengers();

    public Passenger updatePassenger(Passenger passenger);

    public Passenger deletePassenger(int passengerId);

    public Passenger createPassenger(Passenger passenger);


}
