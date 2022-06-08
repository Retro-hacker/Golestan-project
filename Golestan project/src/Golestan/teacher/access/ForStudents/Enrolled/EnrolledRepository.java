package Golestan.teacher.access.ForStudents.Enrolled;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EnrolledRepository implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;

    public EnrolledRepository() throws Exception{

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public List<EnrolledEntity> showLesson() throws Exception{
        preparedStatement = connection.prepareStatement("select id,name,lesson from teachers");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<EnrolledEntity> lessonInfo = new ArrayList<>();

        while (resultSet.next()){
            EnrolledEntity info = new EnrolledEntity();
            info.setLessonId(resultSet.getLong("id"));
            info.setTeacherName(resultSet.getString("name"));
            info.setLesson(resultSet.getString("lesson"));
            lessonInfo.add(info);
        }
        return lessonInfo;
    }

    public List<EnrolledEntity> showStudents() throws Exception{
        preparedStatement = connection.prepareStatement("select id,username,name,about_class,major from students");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<EnrolledEntity> students = new ArrayList<>();

        while (resultSet.next()){
            EnrolledEntity entity = new EnrolledEntity();
            entity.setLessonId(resultSet.getLong("about_class"));
            entity.setStudentId(resultSet.getLong("id"));
            entity.setStudentUsername(resultSet.getLong("username"));
            entity.setStudentName(resultSet.getString("name"));
            entity.setMajor(resultSet.getString("major"));

            students.add(entity);
        }
        return students;
    }


    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
