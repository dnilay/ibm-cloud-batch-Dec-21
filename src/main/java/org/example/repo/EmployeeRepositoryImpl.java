package org.example.repo;

import org.example.model.Employee;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final DataSource dataSource;
    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet resultSet;
    public EmployeeRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private Connection getMyConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public Employee createEmployee(Employee employee) throws SQLException {
        connection=getMyConnection();
        preparedStatement= connection.prepareStatement("insert into employees(id,first_name,last_name,email) values(?,?,?,?)");
        preparedStatement.setInt(1,employee.getEmployeeId());
        preparedStatement.setString(2, employee.getFirstName());
        preparedStatement.setString(3, employee.getLastName());
        preparedStatement.setString(4, employee.getEmail());
        preparedStatement.executeUpdate();
        return employee;
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        return null;
    }
}
