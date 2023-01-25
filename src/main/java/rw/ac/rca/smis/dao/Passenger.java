package rw.ac.rca.smis.dao;

import java.util.Set;

public interface Passenger {
    public rw.ac.rca.smis.orm.Passenger getPassenger(int passengerId);
    public Set<Passenger> getPassengers();
    public rw.ac.rca.smis.orm.Passenger updatePassword(int passengerId);
    public rw.ac.rca.smis.orm.Passenger deletePassenger(int passengerId);
    public rw.ac.rca.smis.orm.Passenger createPassenger(rw.ac.rca.smis.orm.Passenger passenger);


}
