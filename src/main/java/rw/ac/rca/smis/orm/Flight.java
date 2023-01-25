package rw.ac.rca.smis.orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "flight")

public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;
    private int numberOfSeats;
    private int numberOfBookedSeats;
    private static ArrayList<Flight> flights = new ArrayList<Flight>();

    public Flight(int flightNumber, String departureCity, String arrivalCity, String departureTime, String arrivalTime, int numberOfSeats) {
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.numberOfSeats = numberOfSeats;
        this.numberOfBookedSeats = 0;
        flights.add(this);
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfBookedSeats() {
        return numberOfBookedSeats;
    }

    public void setNumberOfBookedSeats(int numberOfBookedSeats) {
        this.numberOfBookedSeats = numberOfBookedSeats;
    }
}