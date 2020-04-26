package MediatorDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChatroom happyChat = new ChatGroup();
		Member member_1,member_2,member_3,member_4,member_5;
		member_1 = new DiamondMember("����");
		member_2 = new DiamondMember("����");
		member_3 = new CommonMember("����");
		member_4 = new CommonMember("����");
		member_5 = new CommonMember("����");
		
		happyChat.register(member_1);
		happyChat.register(member_2);
		happyChat.register(member_3);
		happyChat.register(member_4);
		happyChat.register(member_5);
		
		member_1.sendText("����","����", "���ģ����");
		member_2.sendImage("����", "����", "�������,����ͼƬ");
		member_3.sendImage("����", "����", "��Ҳ��ͼƬ");
		member_4.sendText("����", "����", "�㲻�ܷ�ͼƬ");
		member_5.sendText("����", "����", "������Դ���Ϸ");
	}

}
