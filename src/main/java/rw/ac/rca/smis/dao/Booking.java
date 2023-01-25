package rw.ac.rca.smis.dao;

import org.hibernate.Session;

public interface Booking {
    Booking addBooking(Booking booking);

    Booking removeBooking(Boolean option);

    Booking removeBooking(int bookingId);

    Booking upDateBooking(Booking booking);
    Booking GetBooking(int bookingId );
}

