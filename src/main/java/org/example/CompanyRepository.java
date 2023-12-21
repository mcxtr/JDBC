package org.example;

import java.sql.*;

public class CompanyRepository {
    private final Connection connection = DbConnection.getConnection();
    private final String CREATE_TABLE = "create table company(id serial primary key , name varchar, surName varchar)";
    private final String INSERT_INTO = "insert into company(name,surName)values (?,?)";
    private final String FIND_ALL = "";

    public CompanyRepository() throws SQLException {
    }

    public void create() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(CREATE_TABLE);
        System.out.println("created!");
    }

    public void save(Company company) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO);
        preparedStatement.setString(1, company.getName());
        preparedStatement.setString(2, company.getSurName());
        preparedStatement.executeUpdate();
        System.out.println("saved!");

    }
    public String findAll() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(FIND_ALL);
        return resultSet.getString("cvbnm");
    }
}
