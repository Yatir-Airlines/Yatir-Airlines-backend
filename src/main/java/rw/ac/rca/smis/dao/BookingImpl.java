package rw.ac.rca.smis.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import rw.ac.rca.smis.util.HibernateUtil;

public class BookingImpl implements  Booking{
    SessionFactory sessionFactory;
public BookingImpl(SessionFactory session){
    this.sessionFactory = session;
}
    @Override
    public Booking addBooking(Booking booking) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(booking);
        transaction.commit();
        session.close();
        return booking;
    }

    @Override
    public Booking removeBooking(Boolean option,int bookingId) {
        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Booking booking = (Booking) session.get(Booking.class,bookingId);
        session.delete(booking);
        transaction.commit();
        session.close();
        return booking;
}

  

    @Override

    public Booking upDateBooking(Booking booking,int bookingId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Booking bookings = (Booking) session.get(Booking.class,bookingId);
        session.update(bookings);
        transaction.commit();
        session.close();

        return bookings;
    }

    @Override
    public Booking GetBooking(int bookingId) {

        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Booking booking = (Booking) session.get(Booking.class,bookingId);
        transaction.commit();
        session.close();
        return booking;
  

    }
}

