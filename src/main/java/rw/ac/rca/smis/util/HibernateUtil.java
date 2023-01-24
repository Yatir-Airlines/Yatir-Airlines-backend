package rw.ac.rca.smis.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration().configure().buildSessionFactory();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            return configuration.buildSessionFactory(builder.build());
        } catch (HibernateException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }
}
