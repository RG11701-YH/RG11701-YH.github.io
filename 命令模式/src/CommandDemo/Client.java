package CommandDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������
		Order order_1 = new Order();
		order_1.setId(1);
		order_1.setFruitmap("����", 1);
		order_1.setFruitmap("����", 2);
		order_1.setFruitmap("ƻ��", 3);
		
		Order order_2 = new Order();
		order_2.setId(2);
		order_2.setFruitmap("�㽶", 4);
		order_2.setFruitmap("����", 5);
		order_2.setFruitmap("������", 6);
		//����������
		Operator op = new Operator();
		//�����������װ���������
		OrderCommand cmd_1 = new OrderCommand(op,order_1);
		OrderCommand cmd_2 = new OrderCommand(op,order_2);
		//���������� ��������
		Waitorinvoker waitor = new Waitorinvoker();
		waitor.SetCommand(cmd_1);
		waitor.SetCommand(cmd_2);
		//ִ������
		waitor.OrderUp();
	}

}
