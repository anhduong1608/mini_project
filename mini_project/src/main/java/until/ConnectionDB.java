package until;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String USERNAME = "root";
    private static String PASSWORD = "12345678";

    public Connection openConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return conn;
    }

    public void closeConnection(CallableStatement callSt, Connection conn) {
        if (callSt != null) {
            try {
                callSt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

