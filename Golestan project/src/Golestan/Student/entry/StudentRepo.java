package Golestan.Student.entry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public StudentRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "1234");
        connection.setAutoCommit(false);
    }
    public List<StudentEntity> enter() throws Exception{
        preparedStatement = connection.prepareStatement("select username, password, name from students");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<StudentEntity> entity = new ArrayList<>();
        while (resultSet.next()){
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setUsername(resultSet.getLong("username"));
            studentEntity.setPassword(resultSet.getLong("password"));
            studentEntity.setName(resultSet.getString("name"));
            entity.add(studentEntity);
        }
        return entity;
    }



    public void close() throws Exception{

    }
}
