package rw.ac.rca.smis.orm;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {
    private String name;
    private String email;
    private int registrationNumber;
    private String phoneNumber;

    public Passenger(String name, String email, int registrationNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.registrationNumber = registrationNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
