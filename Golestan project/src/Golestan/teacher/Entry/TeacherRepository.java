package Golestan.teacher.Entry;

import Golestan.Student.MVC.StudentEntity;

import java.sql.*;

public class TeacherRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public TeacherRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }
    public void insertScore (StudentEntity studentEntity) throws Exception{
        preparedStatement = connection.prepareStatement("insert into students(id, user, password, score, termave, average) values(,?,,?,,)");
        preparedStatement.setLong(2,studentEntity.getId());
        preparedStatement.setInt(4,studentEntity.getScore());
    }
    public void updateScore (StudentEntity studentEntity) throws Exception{
        preparedStatement = connection.prepareStatement("update students set score = ? where username = ?");
        preparedStatement.setLong(1,studentEntity.getScore());
        preparedStatement.setLong(2,studentEntity.getUser());
    }

    public String enroll(String lesson) throws Exception{
        ResultSet list = preparedStatement.executeQuery("Select * from students where lesson =" + lesson);
        return String.valueOf(list);
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
