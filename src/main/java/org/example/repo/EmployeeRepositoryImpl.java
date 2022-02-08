package org.example.repo;

import org.example.Employee;
import org.example.factory.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    private MyConnection myConnection;
    private ResultSet resultSet;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private Connection connection;

    public EmployeeRepositoryImpl() {
        myConnection=MyConnection.getObject();
        try {
            connection= myConnection.getMyConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee createEmployee(Employee employee) throws SQLException {
        preparedStatement= connection.prepareStatement("insert into employees(id,first_name,last_name,email) values(?,?,?,?)");
        preparedStatement.setInt(1,employee.getEmployeeId());
        preparedStatement.setString(2, employee.getFirstName());
        preparedStatement.setString(3, employee.getLastName());
        preparedStatement.setString(4, employee.getEmail());
        int result=preparedStatement.executeUpdate();
        System.out.println(result+" row(s) added.");
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        return null;
    }

    @Override
    public Employee updateEmployee(Integer employeeId) throws SQLException {
       return null;
    }

    @Override
    public void deleteEmployee(Integer employeeId) throws SQLException {
        preparedStatement=connection.prepareStatement("delete from employees where id=?");
        preparedStatement.setInt(1,employeeId);
        int result= preparedStatement.executeUpdate();
        if (result==0)
        {
            System.out.println("no such record.");
        }
        else {
            System.out.println("deletion successfull");
        }
    }

    @Override
    public Employee findEmployeeById(Integer employeeId)throws SQLException {
        preparedStatement=connection.prepareStatement("select * from employees where id=?");
        List<Employee> list=new ArrayList<>();
        preparedStatement.setInt(1,employeeId);
        resultSet= preparedStatement.executeQuery();
        while (resultSet.next())
        {
            list.add(new Employee(resultSet.getInt(1),resultSet.getString(2), resultSet.getString(3), resultSet.getString(4) ));

        }
        if (list.isEmpty())
        {
            return null;
        }
        else
        {
            return list.get(0);
        }

    }
}
