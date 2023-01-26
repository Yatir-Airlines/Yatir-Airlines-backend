package rw.ac.rca.smis.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PlaneImpl implements Plane{
    private final SessionFactory sessionFactory;
    public PlaneImpl(SessionFactory session){
this.sessionFactory = session;
    }

    @Override
    public Plane createPlane(Plane plane) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(plane);
        transaction.commit();
        session.close();
        return plane;
    }

    @Override
    public Plane getPlane(int planeId) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        return (Plane) session.get(Plane.class,planeId);
    }

    @Override
    public List<Plane> getPlanes() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Plane.class);
        return criteria.list();

    }

    @Override
    public Plane deletePlane(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Plane plane = (Plane) session.get(Plane.class,id);
        session.delete(plane);
        transaction.commit();
        session.close();
return plane;

    }

    @Override
    public Plane updatePlane(Plane plane) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(plane);
        transaction.commit();
        session.close();
        return plane;

    }
}
