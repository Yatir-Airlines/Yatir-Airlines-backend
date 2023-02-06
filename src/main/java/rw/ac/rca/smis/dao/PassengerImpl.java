package rw.ac.rca.smis.dao;

import org.hibernate.*;

//import java.util.List;
import java.util.Set;

public class PassengerImpl implements Passenger {
    private final SessionFactory sessionFactory;

    public PassengerImpl(SessionFactory session) {
        this.sessionFactory = session;
    }

    @Override
    public Passenger getPassenger(int passengerId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Passenger passenger = (Passenger) session.get(Passenger.class, passengerId);
        transaction.commit();
        session.close();
        return passenger;

    }

    @Override
    public Set<Passenger> getPassengers() {
        Set<Passenger> passenger = null;

        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            passenger = (Set<Passenger>) session.createCriteria(Passenger.class).list();
            transaction.commit();
            session.close();


        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

            return passenger;
    }

    @Override
    public Passenger updatePassenger(Passenger passenger) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(passenger);
        transaction.commit();
        session.close();
        return passenger;

    }

    @Override
    public Passenger deletePassenger(int passengerId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Passenger passenger = (Passenger) session.get(Passenger.class, passengerId);
        session.delete(passenger);
        transaction.commit();
        session.close();
        return passenger;

    }

    @Override
    public Passenger createPassenger(Passenger passenger) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(passenger);
        transaction.commit();
        session.close();
        return passenger;

    }
}
