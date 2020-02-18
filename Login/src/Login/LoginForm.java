package Login;

import java.util.Scanner;

public class LoginForm {
	private String name;
	private String pwd;
	
	public void init() {
		System.out.println("请输入账号和密码：");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		pwd = input.nextLine();
	}
	
	public void display() {
		System.out.println("输入的账号为："+name);
		System.out.println("输入的密码为："+pwd);
	}
	
	public void validate() throws ClassNotFoundException, SQLException {
		UserDAO user = new UserDAO();
		if(user.findUser(name,pwd))
			System.out.println("登录成功!");
		else
			System.out.println("登录失败!");
	}

}
