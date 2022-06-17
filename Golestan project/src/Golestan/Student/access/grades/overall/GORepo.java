package Golestan.Student.access.grades.overall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GORepo {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public GORepo() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }
}
