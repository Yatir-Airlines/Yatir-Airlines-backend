package rw.ac.rca.smis.dao;
import rw.ac.rca.smis.orm.Airline;

import java.util.Set;

public interface AirlineDao {

public Airline getAirline(int airlineId);
public Set<Airline> getAirLines();
public void deleteAirline(int airlineId);
public Airline updateAirline(int airlineId);
public void createAirline(Airline airLine);



}
