package rw.ac.rca.smis.dao;


import rw.ac.rca.smis.orm.Plane;

import java.util.List;

public interface PlaneDao {
    public Plane getPlane(int planeId);

    public List<Plane> getPlanes();
    public Plane deletePlane(int id);
    public Plane updatePlane(Plane plane);
    public Plane createPlane(Plane plane);


}
