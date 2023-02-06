package rw.ac.rca.smis.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class UserImpl implements User{
    private SessionFactory sessionFactory;
    private Serializable id;
    private User user;
    public UserImpl(SessionFactory sessionFactory){
        this.sessionFactory= sessionFactory;
    }
    @Override
    public User createUser(User user) {
        Session session=sessionFactory.openSession();
        Transaction transaction= null;
        try {
            transaction= session.beginTransaction();
            session.save(user);
            transaction.commit();

        }
        catch (HibernateException e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return user;
    }
    @Override
    public User getUser(int userId) {

        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User deleteUser(int id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

}
