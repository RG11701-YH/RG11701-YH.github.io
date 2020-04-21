package CommandDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建多个订单
		Order order_1 = new Order();
		order_1.setId(1);
		order_1.setFruitmap("橙子", 1);
		order_1.setFruitmap("梨子", 2);
		order_1.setFruitmap("苹果", 3);
		
		Order order_2 = new Order();
		order_2.setId(2);
		order_2.setFruitmap("香蕉", 4);
		order_2.setFruitmap("葡萄", 5);
		order_2.setFruitmap("西红柿", 6);
		//创建操作者
		Operator op = new Operator();
		//将多个订单封装成命令对象
		OrderCommand cmd_1 = new OrderCommand(op,order_1);
		OrderCommand cmd_2 = new OrderCommand(op,order_2);
		//创建调用者 并加命令
		Waitorinvoker waitor = new Waitorinvoker();
		waitor.SetCommand(cmd_1);
		waitor.SetCommand(cmd_2);
		//执行命令
		waitor.OrderUp();
	}

}
