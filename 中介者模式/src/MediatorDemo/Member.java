package MediatorDemo;

public abstract class Member {
	protected AbstractChatroom chatroom;
	protected String name;
	
	public abstract void sendText(String from,String to,String message);
	public abstract void sendImage(String from,String to,String message);
	
	public Member(String name) {
		this.name = name;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void receiveText(String from, String newMessage) {
		// TODO Auto-generated method stub
		System.out.println(from + " �����ı�����" + this.name + "����Ϊ��" + newMessage);
	}

	public AbstractChatroom getChatroom() {
		return chatroom;
	}

	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void receiveImage(String from, String image) {
		// TODO Auto-generated method stub
		System.out.println(from + " ����ͼƬ����" + this.name + "����Ϊ��" + image);
	}

}
