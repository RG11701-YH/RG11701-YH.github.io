package Login;

import java.util.Scanner;

public class LoginForm {
	private String name;
	private String pwd;
	
	public void init() {
		System.out.println("�������˺ź����룺");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		pwd = input.nextLine();
	}
	
	public void display() {
		System.out.println("������˺�Ϊ��"+name);
		System.out.println("���������Ϊ��"+pwd);
	}
	
	public void validate() throws ClassNotFoundException, SQLException {
		UserDAO user = new UserDAO();
		if(user.findUser(name,pwd))
			System.out.println("��¼�ɹ�!");
		else
			System.out.println("��¼ʧ��!");
	}

}
