package Test.Utilities;

import Test.ConfigurationReader;

import java.sql.*;

public class Utils {
     Connection conn;
     Statement statement;
     ResultSet rs;

    public  void createConnection(String query) {
        String url = ConfigurationReader.getProperty("url");
        String userName = ConfigurationReader.getProperty("userName");
        String password = ConfigurationReader.getProperty("password");

        try {
            conn = DriverManager.getConnection(url, userName, password);
            statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = statement.executeQuery(query);
            System.out.println("Connection is created and query executed");

            ResultSetMetaData rsm = rs.getMetaData();
            int count = rsm.getColumnCount();
            rs.beforeFirst();

            while (rs.next()){
                for( int i =1; i<=count; i++){
                    System.out.print(rs.getString(i)+" ");
                }
                System.out.println();
            }
            rs.beforeFirst();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Something wrong with connection !!!");
        }
    }


    public  void closeConnection(){
        try {
            rs.close();
            statement.close();
            conn.close();
            System.out.println("All Connections are closed !!!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
