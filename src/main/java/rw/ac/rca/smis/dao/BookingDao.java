package rw.ac.rca.smis.dao;

import rw.ac.rca.smis.orm.Booking;

public interface BookingDao {
    Booking addBooking(Booking booking);

    Booking removeBooking(int bookingId);

    Booking upDateBooking(BookingDao booking, int bookingId);
    Booking GetBooking(int bookingId );
}

