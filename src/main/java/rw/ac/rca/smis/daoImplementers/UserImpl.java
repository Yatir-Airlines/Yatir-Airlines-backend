package rw.ac.rca.smis.daoImplementers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import rw.ac.rca.smis.dao.UserDao;
import rw.ac.rca.smis.orm.User;

import java.util.List;

public class UserImpl implements UserDao {
    private SessionFactory sessionFactory;

    public UserImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User createUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }

        return user;
    }

    @Override
    public User updateUser(int userId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = null;

        try {
            user = (User) session.get(User.class, userId);
            if (user != null) {
                session.update(user);
                transaction.commit();
            }
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }

        return user;
    }

    @Override
    public User deleteUser(int userId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = null;

        try {
            user = (User) session.get(User.class, userId);
            if (user != null) {
                session.delete(user);
                transaction.commit();
            }
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }

        return user;
    }

    @Override
    public User getUser(int userId) {
        Session session = sessionFactory.openSession();
        User user = null;

        try {
            user = (User) session.get(User.class, userId);
        } finally {
            session.close();
        }

        return user;
    }


    @Override
    public List<User> getUsers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<User> users = session.createCriteria(User.class).list();
        transaction.commit();
        session.close();
        return users;
    }

    @Override
    public User getUsers(User user) {
        return null;
    }

}