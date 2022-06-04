package Golestan.teacher.access.Salary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SalaryRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public SalaryRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
