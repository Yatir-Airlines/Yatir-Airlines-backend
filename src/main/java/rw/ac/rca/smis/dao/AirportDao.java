package rw.ac.rca.smis.dao;

import rw.ac.rca.smis.orm.Airport;

import java.util.Set;

public interface AirportDao {
    public Airport getAirport(int id);
    public Set<Airport> getAirports();
    public Airport updateAirport(int airportId);
    public Airport deleteAirport(int airportId );
    public Airport createAirport(Airport airport);
}
