package rw.ac.rca.smis.dao;

import rw.ac.rca.smis.orm.User;

public interface UserDao {
    public User createUser(User user);
    public User updateUser(int userId);
    public User deleteUser(int userId);
    public User getUser(int userId);
    public User getUsers(User user);

}
