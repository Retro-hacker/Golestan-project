package Golestan.teacher.access.ForStudents.Enrolled.Remove;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RemoveRepository implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;

    public RemoveRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public void commit() throws Exception{
        connection.commit();
    }
    public void rollback() throws Exception{
        connection.rollback();
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
