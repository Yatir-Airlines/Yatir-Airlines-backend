package rw.ac.rca.smis.daoImplementers;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.smis.dao.PlaneDao;
import rw.ac.rca.smis.orm.Plane;

import java.util.List;

public class PlaneImpl implements PlaneDao {
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
        Criteria criteria = session.createCriteria(PlaneDao.class);
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

        return null;
    }


}
