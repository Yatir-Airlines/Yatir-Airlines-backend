package rw.ac.rca.smis.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class BookingImpl implements BookingDao {

    public SessionFactory sessionFactory;

    public BookingImpl(SessionFactory session) {
        this.sessionFactory = session;
    }

        @Override
        public BookingDao addBooking (BookingDao booking){
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(booking);
            transaction.commit();
            session.close();
            return booking;
        }

        @Override
        public BookingDao removeBooking (Boolean option, int bookingId){
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            BookingDao booking = (BookingDao) session.get(BookingDao.class, bookingId);
            session.delete(booking);
            transaction.commit();
            session.close();
            return booking;
        }

    @Override
    public BookingDao upDateBooking(BookingDao booking, int bookingId) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            BookingDao bookings = (BookingDao) session.get(BookingDao.class, bookingId);
            session.update(bookings);
            transaction.commit();
            session.close();

            return bookings;

    }




        @Override
        public BookingDao GetBooking (int bookingId){

            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            BookingDao booking = (BookingDao) session.get(BookingDao.class, bookingId);
            transaction.commit();
            session.close();
            return booking;


        }
    }

