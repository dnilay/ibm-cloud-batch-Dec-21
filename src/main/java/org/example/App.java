package org.example;

import org.example.factory.MyConnection;

import java.sql.*;
import java.util.ArrayList;
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
         /*  //step-1 Load the driver
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           //step-2 Connect to the database
           Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
           //step-3 create statement object*/

           MyConnection myConnection=MyConnection.getObject();
           MyConnection c=MyConnection.getObject();
           System.out.println(myConnection==c);
           Connection connection= myConnection.getMyConnection();
           Statement statement=connection.createStatement();
           //step-4 retrieve results
           ResultSet resultSet=statement.executeQuery("select * from employees");
           List<Employee> list=new ArrayList<>();
           while (resultSet.next())
           {
               Employee employee=new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
               list.add(employee);
           }

           //System.out.println(list);

           Iterator<Employee> iterator= list.iterator();
           while (iterator.hasNext())
           {
               System.out.println(iterator.next());
           }
       }
       catch (SQLException e)
       {
           e.printStackTrace();
       }
    }
}
