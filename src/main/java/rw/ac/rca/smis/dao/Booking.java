package rw.ac.rca.smis.dao;

import org.hibernate.Session;

public interface Booking {
    Booking addBooking(Booking booking);

    Booking removeBooking(int bookingId);

    Booking upDateBooking(Booking booking,int bookingId);
    Booking GetBooking(int bookingId );
}

