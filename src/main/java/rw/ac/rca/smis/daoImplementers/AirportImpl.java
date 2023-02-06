package rw.ac.rca.smis.daoImplementers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.smis.dao.AirportDao;
import rw.ac.rca.smis.orm.Airport;

import java.util.Set;

public class AirportImpl implements AirportDao {
    private SessionFactory sessionFactory;

    public AirportImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Airport getAirport(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Airport airport = (Airport) session.get(Airport.class, id);

        transaction.commit();
        session.close();

        return airport;
    }

    @Override
    public Set<Airport> getAirports() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Set<Airport> airports = (Set<Airport>) session.createCriteria(Airport.class).list();

        transaction.commit();
        session.close();

        return airports;
    }

    @Override
    public Airport updateAirport(int airportId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Airport airport = (Airport) session.get(Airport.class, airportId);
        session.update(airport);

        transaction.commit();
        session.close();

        return airport;
    }

    @Override
    public Airport deleteAirport(int airportId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Airport airport = (Airport) session.get(Airport.class, airportId);
        session.delete(airport);

        transaction.commit();
        session.close();

        return airport;
    }

    @Override
    public Airport createAirport(Airport airport) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(airport);

        transaction.commit();
        session.close();

        return airport;
    }
}
