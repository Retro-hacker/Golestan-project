package Golestan.Student.access.courses.courseselection;

import Golestan.teacher.access.ForStudents.Enrolled.EnrolledEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CSRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public CSRepo() throws Exception{

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }


    public List<CSEntity> showCourses() throws Exception{
        preparedStatement = connection.prepareStatement("select id,subject,hours,teacher from students");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<CSEntity> subjectsInfo = new ArrayList<>();

        while (resultSet.next()){
            CSEntity info = new CSEntity();
            info.setSubjectID(resultSet.getInt("id"));
            info.setSubjectName(resultSet.getString("subject"));
            info.setVahed(resultSet.getInt("vahed"));
            info.setClasstime(resultSet.getString("class time"));
            info.setTeacher(resultSet.getString("teacher"));
            subjectsInfo.add(info);
        }
        return subjectsInfo;
    }

    @Override
    public void close() throws Exception {

    }
}
