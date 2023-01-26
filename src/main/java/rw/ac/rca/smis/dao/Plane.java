package rw.ac.rca.smis.dao;

import java.util.List;
import java.util.Set;

public interface Plane {
    public  Plane getPlane(int planeId);
    public List<Plane> getPlanes();
    public Plane deletePlane(int id);
    public Plane updatePlane(Plane plane);
    public Plane createPlane(Plane plane);

}
