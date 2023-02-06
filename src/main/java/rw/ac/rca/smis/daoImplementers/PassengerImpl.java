package rw.ac.rca.smis.daoImplementers;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.smis.dao.PassengerDao;
import rw.ac.rca.smis.orm.Passenger;

import java.util.List;

public class PassengerImpl implements PassengerDao {
    private final SessionFactory sessionFactory;
    public PassengerImpl(SessionFactory session){
        this.sessionFactory = session;
    }

    @Override
    public Passenger getPassenger(int passengerId) {
        Session session = sessionFactory.openSession();
        Transaction transaction  = session.beginTransaction();
        Passenger passenger = (Passenger) session.get(Passenger.class,passengerId);
        transaction.commit();
        session.close();
        return passenger;

    }

    @Override
    public List<Passenger> getPassengers() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(PassengerDao.class);
        return criteria.list();
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
        Passenger passenger =(Passenger) session.get(Passenger.class,passengerId);
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
