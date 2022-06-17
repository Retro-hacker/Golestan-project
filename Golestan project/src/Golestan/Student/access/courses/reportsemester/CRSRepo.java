package Golestan.Student.access.courses.reportsemester;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRSRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public CRSRepo() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "1234");
        connection.setAutoCommit(false);
    }
    public List<CRSEntity> showCourses() throws Exception{
        preparedStatement = connection.prepareStatement("select subject,vahed,teacher,classtime from students");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<CRSEntity> subjectsInfo = new ArrayList<>();

        while (resultSet.next()){
            CRSEntity info = new CRSEntity();
            info.setSubject(resultSet.getString("subject"));
            info.setVahed(resultSet.getInt("Vahed"));
            info.setTeacher(resultSet.getString("Teacher"));
            info.setClasstime(resultSet.getString("class time"));
            subjectsInfo.add(info);
        }
        return subjectsInfo;
    }


    public void close() throws Exception{
        connection.close();
        preparedStatement.close();
    }
}
