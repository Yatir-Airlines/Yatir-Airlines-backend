package rw.ac.rca.smis.daoImplementers;

import org.hibernate.*;
import rw.ac.rca.smis.dao.FlightDao;
import rw.ac.rca.smis.orm.Flight;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class FlightImpl implements FlightDao {
    private SessionFactory sessionFactory;
    private Serializable id;
    private FlightDao flight1;

    public FlightImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Flight createFlight(Flight flight) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(flight);
            transaction.commit();

        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        } finally {
            session.close();
        }
        return (Flight) flight;
    }

    @Override
    public Set<Flight> getFlights() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        ArrayList<Flight> flights = (ArrayList<Flight>) session.createCriteria(FlightDao.class).list();
        transaction.commit();
        session.close();
        return new HashSet<>(flights);


    }

    @Override
    public Flight getFlight(Flight flight, Serializable id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Flight f = (Flight) session.get(Flight.class, id);
        transaction.commit();
        session.close();
        return f;
    }


    @Override
    public Flight deleteFlight(Flight flight) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(flight);
        transaction.commit();
        session.close();
        return flight;
    }

    @Override
    public Flight updateFlight(Flight flight) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(flight);
        transaction.commit();
        session.close();
        return flight;

    }
}
