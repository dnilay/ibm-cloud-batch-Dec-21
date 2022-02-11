package org.example;

import org.example.config.SpringConfig;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
           AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
           SessionFactory sessionFactory=applicationContext.getBean("sessionFactory",SessionFactory.class);
           Session session= sessionFactory.openSession();
          /* Student tempStudent = new Student("Marry","Public","marry@luv2code.com");
           Set<String> theImages = tempStudent.getImages();

           theImages.add("photo1.jpg");
           theImages.add("photo2.jpg");
           theImages.add("photo3.jpg");
           theImages.add("photo4.jpg");
           theImages.add("photo4.jpg"); //Duplicate, filtered at java level by HashSet!!!
           theImages.add("photo5.jpg");
           theImages.add("photo5.jpg"); //Duplicate, filtered at java level by HashSet!!!

           //start a transaction
           session.beginTransaction();

           //save the object
           System.out.println("Saving the student and images..");
           session.persist(tempStudent);

           //commit the transaction
           session.getTransaction().commit();*/
           Student student=session.find(Student.class,2);
         /*  if(student==null)
           {
               throw new IllegalArgumentException("student not found");
           }
           System.out.println(student);
           session.getTransaction().begin();
           session.delete(student);
           session.getTransaction().commit();
           System.out.println("Done!!");*/
           TypedQuery query=session.createQuery("FROM Student S");
           List<Student> list=query.getResultList();
           if(list.isEmpty())
           {
               throw new RuntimeException("list is empty");
           }


       }
       catch (Exception e)
       {
           System.err.println(e.getMessage());
       }
    }
}
