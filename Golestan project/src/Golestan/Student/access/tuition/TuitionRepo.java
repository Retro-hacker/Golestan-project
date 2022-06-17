package Golestan.Student.access.tuition;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TuitionRepo implements AutoCloseable {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public TuitionRepo() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }

    public List<TuitionEntity> showTuition() throws Exception{
        preparedStatement = connection.prepareStatement("select tuition from students");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<TuitionEntity> subjectsInfo = new ArrayList<>();

        while (resultSet.next()){
            TuitionEntity info = new TuitionEntity();
            info.setFee(resultSet.getInt("tuition"));
            subjectsInfo.add(info);
        }
        return subjectsInfo;
    }

    @Override
    public void close() throws Exception {

    }
}
