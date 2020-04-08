package FactoryDemo_1;

public class ClientClass {
	public static void main(String[] args) {
		//第一种方法
//		Factory factory = new BFactory();
//		Fruit fruit = factory.CreateFruit();
//		fruit.eat();	
		//第二种，使用DOM,反射，和XML配置文件
		Factory factory=(Factory)XMLUtil.getBean();
		Fruit fruit=factory.CreateFruit();
		fruit.eat();
	}
}
