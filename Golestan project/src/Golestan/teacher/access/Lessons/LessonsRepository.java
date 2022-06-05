package Golestan.teacher.access.Lessons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LessonsRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public LessonsRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public List<LessonsEntity> showLessons() throws Exception{
        preparedStatement = connection.prepareStatement("select * from teachers");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<LessonsEntity> show = new ArrayList<>();

        while (resultSet.next()){
            LessonsEntity lessonsEntity = new LessonsEntity();
            lessonsEntity.setName(resultSet.getString("name"));
            lessonsEntity.setLessons(resultSet.getString("lesson"));
            lessonsEntity.setDay(resultSet.getString("days"));
            lessonsEntity.setTime(resultSet.getString("time"));
            lessonsEntity.setCourses(resultSet.getInt("course"));
            show.add(lessonsEntity);
        }

        return show;
    }
    public void commit() throws Exception{
        connection.commit();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
