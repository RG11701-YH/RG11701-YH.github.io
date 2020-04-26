package MediatorDemo;

public class DiamondMember extends Member {

	public DiamondMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendText(String from, String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("钻石会员发送消息：");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String from, String to, String message) {
		// TODO Auto-generated method stub
		System.out.println("钻石会员发送图片：");
		chatroom.sendImage(name, to, message);
	}

}
