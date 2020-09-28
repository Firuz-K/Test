package Test.JDBC;

import Test.Utilities.Utils;
import org.junit.Test;

import java.sql.*;

public class Hr_DB {


    @Test
    public  void test() throws SQLException {

        String url ="jdbc:oracle:thin:@52.3.242.24:1521:xe";

        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@52.3.242.24:1521:xe", "hr", "hr");

        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = statement.executeQuery("SELECT * FROM movies");

        ResultSetMetaData rsm = rs.getMetaData();

        int count = rsm.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= count; i++) {
                System.out.print(rs.getString(i) + "  ");
            }
            System.out.println();
        }

        rs.close();
        statement.close();
        conn.close();


    }


    @Test
    public void test2(){

        Utils utils = new Utils();
        utils.createConnection("Select * from employees");
        utils.closeConnection();




    }


}
