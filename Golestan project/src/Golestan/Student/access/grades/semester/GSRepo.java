package Golestan.Student.access.grades.semester;

import Golestan.Student.access.tuition.TuitionEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GSRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public GSRepo() throws Exception{

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public List<GSEntity> showGrades() throws Exception{
        preparedStatement = connection.prepareStatement("select subject,teacher,vahed,classtime,grade from students");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<GSEntity> subjectsInfo = new ArrayList<>();

        while (resultSet.next()){
            GSEntity info = new GSEntity();
            info.setSubject(resultSet.getString("subject"));
            info.setTeacher(resultSet.getString("teacher"));
            info.setVahed(resultSet.getInt("vahed"));
            info.setClasstime(resultSet.getString("class time"));
            info.setGrade(resultSet.getFloat("grade"));
            subjectsInfo.add(info);
        }
        return subjectsInfo;
    }


    @Override
    public void close() throws Exception {

    }
}
