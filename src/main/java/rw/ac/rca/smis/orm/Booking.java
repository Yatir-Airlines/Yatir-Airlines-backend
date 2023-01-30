package rw.ac.rca.smis.orm;

import org.hibernate.Session;
import rw.ac.rca.smis.util.HibernateUtil;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "booking")
public class   Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    @OneToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;
    private Date BookingDate;
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Date getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(Date bookingDate) {

        BookingDate = bookingDate;
    }
}