package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "flight")

public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int flightNumber;
    private Date departure;
    private Date arrival;

    public Flight(Date departure, Date arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Flight() {

    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }
}