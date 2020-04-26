package MediatorDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChatroom happyChat = new ChatGroup();
		Member member_1,member_2,member_3,member_4,member_5;
		member_1 = new DiamondMember("张三");
		member_2 = new DiamondMember("李四");
		member_3 = new CommonMember("王五");
		member_4 = new CommonMember("赵六");
		member_5 = new CommonMember("孙七");
		
		happyChat.register(member_1);
		happyChat.register(member_2);
		happyChat.register(member_3);
		happyChat.register(member_4);
		happyChat.register(member_5);
		
		member_1.sendText("张三","李四", "李四，你好");
		member_2.sendImage("李四", "王五", "王五你好,这是图片");
		member_3.sendImage("王五", "赵六", "我也发图片");
		member_4.sendText("赵六", "王五", "你不能发图片");
		member_5.sendText("孙七", "张三", "今天可以打游戏");
	}

}
