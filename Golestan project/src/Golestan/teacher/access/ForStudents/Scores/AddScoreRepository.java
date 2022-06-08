package Golestan.teacher.access.ForStudents.Scores;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AddScoreRepository implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;

    public AddScoreRepository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public void addScore(AddScoreEntity addScoreEntity) throws Exception{
        preparedStatement = connection.prepareStatement("update students set score = ? where username = ? and about_class = ?");

        preparedStatement.setFloat(1,addScoreEntity.getScore());
        preparedStatement.setLong(2,addScoreEntity.getStudentUsername());
        preparedStatement.setInt(3,addScoreEntity.getCourse());
        preparedStatement.executeUpdate();

    }

    public List<LessonsList> showLessonsCode() throws Exception{
        preparedStatement = connection.prepareStatement("select id,lesson from teachers");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<LessonsList> list = new ArrayList<>();

        while (resultSet.next()){
            LessonsList lessonsList = new LessonsList();
            lessonsList.setId(resultSet.getLong("id"));
            lessonsList.setLesson(resultSet.getString("lesson"));

            list.add(lessonsList);
        }
        return list;
    }


    public void commit() throws Exception{
        connection.commit();
    }

    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }

    }
