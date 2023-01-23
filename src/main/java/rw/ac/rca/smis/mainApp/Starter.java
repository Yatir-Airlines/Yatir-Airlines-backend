package rw.ac.rca.smis.mainApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rw.ac.rca.smis.orm.Flight;


import java.util.Date;

public class Starter{
  public static void main(String args[]) {
      Flight flight = new Flight(new Date("10/10/2022"),new Date("12/04/2023"));

      Configuration configuration = new Configuration();
      configuration.configure("hibernate.cfg.xml");

      try {
         SessionFactory factory = configuration.buildSessionFactory();
          Session session = factory.openSession();

          System.out.println("Begin transaction ......................");
          Transaction transaction = session.beginTransaction();
           session.saveOrUpdate(flight);
          System.out.println("Committing transaction .................");
          transaction.commit();

          session.close();
          factory.close();

      } catch (HibernateException e) {
          e.printStackTrace();
      }
  }
  }
