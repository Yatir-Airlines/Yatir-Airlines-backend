package rw.ac.rca.smis.dao;


import org.hibernate.Session;
import rw.ac.rca.smis.util.HibernateUtil;

public class BookingImpl implements Booking{

    @Override
    public Booking addBooking(Booking booking) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(booking);
        session.getTransaction().commit();
        session.close();
        return booking;
    }

    @Override
    public Booking removeBooking(Boolean option,int bookingId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Booking booking = (Booking) session.get(Booking.class,bookingId);
        session.delete(booking);
        session.getTransaction().commit();
        session.close();
        return null;
    }

    @Override
    public Booking upDateBooking(Booking booking,int bookingId) {
        Sesssion session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Booking booking = (Booking) session.get(Booking.class,bookingId);
        session.put(booking);
        session.getTransaction().commit();
        session.close();
        return null;
    }

    @Override
    public Booking GetBooking(int bookingId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Booking booking = (Booking) session.get(Booking.class,bookingId);
        session.getTransaction().commit();
        session.close();
        return null;
    }
}

