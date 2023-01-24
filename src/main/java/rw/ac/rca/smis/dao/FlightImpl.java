package rw.ac.rca.smis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;


public class FlightImpl implements Flight {
    private SessionFactory sessionFactory;
    public FlightImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Set<Flight>  getFlights() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction() ;


    }

    @Override
    public Flight getFlight(Flight flight, Serializable id) {
        return null;
    }

    @Override
    public Flight deleteFlight(Flight flight) {
        return null;
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return null;
    }

    @Override
    public Flight createFlight(Flight flight) {
        return null;
    }
}

