package rw.ac.rca.smis.dao;

import java.util.List;

public interface User {
    public User getUser(int userId);

    public List<User> getUsers();
    public User deleteUser(int id);
    public User updateUser(User user);
    public User createUser(User user);
}
