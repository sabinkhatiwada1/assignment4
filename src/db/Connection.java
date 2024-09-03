package db;

import java.sql.DriverManager;

public class Connection {
    public static java.sql.Connection getConnection() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return  DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","mmmmssss@#");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
