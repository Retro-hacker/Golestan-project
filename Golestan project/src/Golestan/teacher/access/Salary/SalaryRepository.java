package Golestan.teacher.access.Salary;

import Golestan.teacher.Entry.TeacherEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SalaryRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public SalaryRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }



    public List<SalaryEntity> ShowSalary() throws Exception{

        preparedStatement = connection.prepareStatement("select username, lesson, salary from teachers");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<SalaryEntity> list = new ArrayList<>();

        while (resultSet.next()){
            SalaryEntity salary = new SalaryEntity();
            salary.setUsername(resultSet.getLong("username"));
            salary.setLesson(resultSet.getString("lesson"));
            salary.setSalary(resultSet.getInt("salary"));
            list.add(salary);
        }
        return list;
    }
    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
