package org.example.repo;

import org.example.Employee;
import org.example.factory.MyConnection;

import java.sql.*;
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

    }

    @Override
    public Employee findEmployeeById(Integer employeeId)throws SQLException {
        return null;
    }
}
