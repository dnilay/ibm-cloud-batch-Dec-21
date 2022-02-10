package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.List;

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
           /* Customer customer=new Customer("John Doe");
            session.getTransaction().begin();
            session.save(customer);
            session.getTransaction().commit();
            System.out.println("customer saved... ");*/
            session.getTransaction().begin();
            TypedQuery query= session.createQuery("FROM Customer C WHERE C.customerName=:cName");
            query.setParameter("cName","John1 Doe");
            List<Customer> list=query.getResultList();
            session.getTransaction().commit();
            Iterator<Customer> iterator= list.iterator();
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }

            session.getTransaction().begin();
            Customer customer=session.find(Customer.class,3);
            session.getTransaction().commit();
            System.out.println(customer);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
