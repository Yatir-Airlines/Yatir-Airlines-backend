package rw.ac.rca.smis.dao;

import org.hibernate.Session;

public interface Booking {
    Booking addBooking(Booking booking);

    Booking removeBooking(Boolean option);
    Booking upDateBooking(Booking booking);
    Booking GetBooking(int booking.id);
}
