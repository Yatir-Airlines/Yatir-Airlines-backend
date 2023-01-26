package rw.ac.rca.smis.dao;

import java.util.HashSet;
import rw.ac.rca.smis.orm.Airline;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AirlineImpl implements AirlineDao{
    private final SessionFactory sessionFactory;

    public AirlineImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public HashSet<Airline> getAirLines() {
        Session session = sessionFactory.openSession();
        HashSet<Airline> airlines;
        try {
            airlines= new HashSet<Airline>(session.createCriteria(Airline.class).list());
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
        return airlines;
    }

    @Override
    public void createAirline(Airline airline) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(airline);
        transaction.commit();
        session.close();
    }

    @Override
    public Airline getAirline(int airlineId){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Airline airline = (Airline) session.get(Airline.class,airlineId);
        transaction.commit();
        session.close();
        return airline;
    }
    @Override
    public Airline updateAirline(int airlineId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Airline airline= (Airline)session.get(Airline.class, airlineId);
        session.update(airline);
        transaction.commit();
        return airline;
    }

    public void deleteAirline(int airlineId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Airline airline = (Airline)session.get(Airline.class, airlineId);
        session.delete(airline);
        transaction.commit();
        session.close();
    }
}