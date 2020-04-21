package CommandDemo;

public class OrderCommand implements Command {
	
	private Operator receiver;
	private Order order;
	//������������һ����ִ���ߣ�һ����ִ�е�Ŀ��
	public OrderCommand(Operator receiver,Order order) {
		this.receiver = receiver;
		this.order = order;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(order.getId() + "�Ź˿͵ĳ�Ʒ");
		receiver.MarkFruit(order);
	}

}
