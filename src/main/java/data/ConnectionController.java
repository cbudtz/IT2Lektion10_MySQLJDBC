package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionController {
    private static Connection conn;

    public static Connection getConnection(){
        //Create a connection
        try {
            if (conn==null || conn.isClosed()) {
                conn = DriverManager.getConnection("jdbc:mysql://db.diplomportal.dk/chbu?"
                        + "user=chbu&password=tIp1POywlKKdZaQuVR3V1");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private ConnectionController(){

    }
}
