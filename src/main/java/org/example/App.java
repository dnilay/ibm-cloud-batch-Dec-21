package org.example;

import org.example.config.SpringConfig;
import org.example.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{




    public static void main(String[] args )
    {
        try {
            SessionFactory sessionFactory=null;
            App app=new App();
            AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
            sessionFactory=applicationContext.getBean("sessionFactory",SessionFactory.class);
            Customer customer=new Customer("Marry Public","marry@email.com");
            Session session=sessionFactory.openSession();
           // session.getTransaction().begin();
            session.save(customer);
           // session.getTransaction().commit();
            System.out.println("saved: "+customer);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
