package Golestan.teacher.Entry;

import Golestan.teacher.access.Salary.SalaryEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public TeacherRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public List<TeacherEntity> login() throws Exception{

        preparedStatement = connection.prepareStatement("select username , password , name from teachers");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<TeacherEntity> entityList = new ArrayList<>();

        while (resultSet.next()){
            TeacherEntity teacherEntity = new TeacherEntity();
            teacherEntity.setUser(resultSet.getLong("username"));
            teacherEntity.setPassword(resultSet.getString("password"));
            teacherEntity.setName(resultSet.getString("name"));
            entityList.add(teacherEntity);
        }
        return entityList;
    }

    public void commit() throws Exception{
        connection.commit();
    }


    public void rollback() throws Exception{
       connection.rollback();
    }



    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
