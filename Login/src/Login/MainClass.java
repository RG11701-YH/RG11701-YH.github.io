package Login;

import java.sql.SQLException;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		LoginForm login = new LoginForm();
		login.init();
		login.display();
		login.validate();
	}

}
