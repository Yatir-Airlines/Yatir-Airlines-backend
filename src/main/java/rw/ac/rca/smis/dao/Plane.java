package rw.ac.rca.smis.dao;

import java.util.Set;

public interface Plane {
    public  Plane getPlane(int planeId);
    public Set<Plane> getPlanes();
    public Plane deletePlane(int planeId);
    public Plane updatePlane(Plane plane);

}
