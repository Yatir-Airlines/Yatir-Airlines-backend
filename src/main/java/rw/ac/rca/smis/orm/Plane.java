package rw.ac.rca.smis.orm;

import javax.persistence.*;

@Entity
@Table(name="plane")
public class Plane {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String make;
    private String model;
    private int NumberOfSeats;
    public Plane() {

    }
    public Plane(int id, String make, String model, int numberOfSeats) {
        this.id = id;
        this.make = make;
        this.model = model;
        NumberOfSeats = numberOfSeats;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }
}
