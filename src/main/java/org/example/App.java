package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer=context.getBean("customer",Customer.class);
        //Customer customer1=context.getBean("customer",Customer.class);
        //System.out.println(customer==customer1);
		System.out.println(customer);
            Coach myCoach=context.getBean("theCoach",Coach.class);
            System.out.println(myCoach.getDailyWorkout());
            System.out.println(myCoach.getDailyFortune());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
