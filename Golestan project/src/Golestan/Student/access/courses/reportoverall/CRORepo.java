package Golestan.Student.access.courses.reportoverall;

import Golestan.Student.access.courses.reportsemester.CRSEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRORepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public CRORepo() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "golestan_system", "Parsa1382");
        connection.setAutoCommit(false);
    }
    public List<CROEntity> showReport() throws Exception{
        preparedStatement = connection.prepareStatement
                ("select subject,teacher,vahed,classtime,vahedpassed,vahedfailed from students");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<CROEntity> reportInfo = new ArrayList<>();

        while (resultSet.next()){
            CROEntity info = new CROEntity();
            info.setSubject(resultSet.getString("subject"));
            info.setTeacher(resultSet.getString("Teacher"));
            info.setVahed(resultSet.getInt("Vahed"));
            info.setClasstime(resultSet.getString("class time"));
            info.setTotalPassedVahed(resultSet.getInt("total Vahed passed"));
            info.setTotalFailedVahed(resultSet.getInt("total vahed failed"));
            reportInfo.add(info);
        }
        return reportInfo;
    }


    @Override
    public void close() throws Exception {

    }
}
