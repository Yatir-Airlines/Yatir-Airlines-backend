package rw.ac.rca.smis.dao;

import org.hibernate.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;


public class FlightImpl implements Flight {
    private SessionFactory sessionFactory;
    public FlightImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override public Flight createFlight(Flight flight) {
        Session session=sessionFactory.openSession();
        Transaction transaction= null;
        try {
        transaction= session.beginTransaction();
        session.save(flight);
        transaction.commit();

        }
        catch (HibernateException e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();

        }
        finally {
            session.close();
        }
        return flight;
    }

    @Override
    public Set<Flight>  getFlights() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction() ;
        Set<Flight> flights= null;
        try{
            flights= (Set<Flight>) session.createCriteria(Flight.class).list();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }
        finally{
            session.close();
        }
        return flights;

    }


    @Override
    public Flight getFlight(Flight flight, Serializable id) {
        Session session= sessionFactory.openSession();
        Flight flight1= null;
        try {
            flight1= (Flight)session.get(Flight.class, id);
        }
        catch (HibernateException e){
            e.printStackTrace();

        }
        finally {
            session.close();
        }
        return flight1;
    }
    @Override
    public Flight updateFlight(Flight flight) {
        Session session= sessionFactory.openSession();
        Transaction transaction= null;
        try{
            transaction= session.beginTransaction();
            session.update(flight);
            transaction.commit();
        }
        catch(HibernateException e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return flight;
    }
    @Override
    public Flight deleteFlight(Flight flight) {
        Session session= sessionFactory.openSession();
        Transaction transaction= null;
        try{
            transaction= session.beginTransaction();
            session.delete(flight);
            transaction.commit();
        }
        catch (HibernateException e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return null;
    }



}



