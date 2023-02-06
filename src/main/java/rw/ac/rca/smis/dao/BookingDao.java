package rw.ac.rca.smis.dao;

import rw.ac.rca.smis.orm.Booking;
public interface BookingDao {
    BookingDao addBooking(BookingDao booking);
    BookingDao removeBooking(Boolean option, int bookingId);
    BookingDao upDateBooking(BookingDao booking, int bookingId);
    BookingDao GetBooking(int bookingId );




}

