package Login;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {

	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverMannager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=WebStore");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}