package Tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestData {
	private static Connection connection;

    public static Connection getConnection() throws Exception {

        String url = "jdbc:sqlserver://192.168.254.141:61374;databaseName=VDEMPROD";
        String user = "sa";
        String password = "techno-123";

        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

    public static ResultSet executeQuery(String query) throws Exception {
        Statement stmt = getConnection().createStatement();
        return stmt.executeQuery(query);
    }

    public static void closeConnection() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
    
    public static void main(String[] args) throws Exception {
    	String query =
    	          "SELECT * FROM TB_M_USER_MASTER";

    	        ResultSet rs = executeQuery(query);

    	        
	}
}
