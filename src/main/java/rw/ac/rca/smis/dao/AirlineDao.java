package rw.ac.rca.smis.dao;
import org.hibernate.SessionFactory;
import rw.ac.rca.smis.orm.Airline;

import java.util.Set;

public interface AirlineDao {
  public getAirline(int airlineId);

public Airline getAirline(int airlineId);
public Set<Airline> getAirLines();
public Airline deleteAirline(int airlineId);
public Airline updateAirline(int airlineId);
public Airline createAirline(Airline airLine);



}
