package rw.ac.rca.smis.dao;

import rw.ac.rca.smis.orm.Airline;

import java.util.Set;

public interface Airport {
    public Airport getAirport(int id);
    public Set<Airport> getAirports();
    public Airport updateAirport(int airportId);
    public  Airport deleteAirport(int airportId );
    public  Airport createAirport(Airport airport);
}
