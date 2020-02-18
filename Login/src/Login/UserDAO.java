package Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	public boolean findUser(String userName,String userPassword) throws ClassNotFoundException,SQLException{
		DBUtil db = new DBUtil();
		Connection con = db.getConnection();
		Statement statement=con.createStatement();
		String sql="select username,password from user";
		ResultSet rs=statement.executeQuery(sql);
		while(rs.next()) {
			String name=rs.getString("username");
			String pwd=rs.getString("password");
			if(name.equals(userName)&&pwd.equals(userPassword)) {
				return true;
			}
		}
		rs.close();
		con.close();
		return false;
	}

}
