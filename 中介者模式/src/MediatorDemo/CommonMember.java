package MediatorDemo;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendText(String from, String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ��Ա������Ϣ��");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String from, String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("��ͨ��Ա���ܷ���ͼƬ");
	}

}
