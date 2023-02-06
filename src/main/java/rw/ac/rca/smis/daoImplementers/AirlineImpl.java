package rw.ac.rca.smis.daoImplementers;

import rw.ac.rca.smis.dao.AirlineDao;
import rw.ac.rca.smis.orm.Airline;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AirlineImpl implements AirlineDao {
    private SessionFactory sessionFactory;

    public AirlineImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Airline getAirline(int airlineId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Airline airline = (Airline) session.get(Airline.class, airlineId);
        transaction.commit();
        session.close();
        return airline;
    }

    @Override
    public Set<Airline> getAirLines() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Set<Airline> airlines = new HashSet<>(session.createCriteria(Airline.class).list());
        transaction.commit();
        session.close();
        return airlines;
    }

    @Override
    public Airline deleteAirline(int airlineId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Airline airline = (Airline) session.get(Airline.class, airlineId);
        if (airline != null) {
            session.delete(airline);
        }
        transaction.commit();
        session.close();
        return airline;
    }

    @Override
    public Airline updateAirline(int airlineId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Airline airline = (Airline) session.get(Airline.class, airlineId);
        if (airline != null) {
            // update the airline object
            session.update(airline);
        }
        transaction.commit();
        session.close();
        return airline;
    }

    @Override
    public Airline createAirline(Airline airLine) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(airLine);
        transaction.commit();
        session.close();
        return airLine;
    }
}
