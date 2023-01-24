package rw.ac.rca.smis.dao;

public interface Booking {
    Booking addBooking(Booking booking);
    Booking removeBooking(Boolean option);
    Booking upDateBooking(Booking booking);
    Booking GetBooking(int bookingId );
}
