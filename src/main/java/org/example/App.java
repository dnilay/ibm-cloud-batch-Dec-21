package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {

            SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Customer.class)
                    .buildSessionFactory();
            Session session=sessionFactory.openSession();
            Customer customer=new Customer("John Doe");
            session.getTransaction().begin();
            session.save(customer);
            session.getTransaction().commit();
            System.out.println("customer saved... ");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
