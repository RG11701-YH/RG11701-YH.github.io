package FactoryDemo_1;

public class ClientClass {
	public static void main(String[] args) {
		//��һ�ַ���
//		Factory factory = new BFactory();
//		Fruit fruit = factory.CreateFruit();
//		fruit.eat();	
		//�ڶ��֣�ʹ��DOM,���䣬��XML�����ļ�
		Factory factory=(Factory)XMLUtil.getBean();
		Fruit fruit=factory.CreateFruit();
		fruit.eat();
	}
}
