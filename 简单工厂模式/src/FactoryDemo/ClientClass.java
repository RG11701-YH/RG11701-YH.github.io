package FactoryDemo;

public class ClientClass {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Fruit fruit = factory.CreateFruit("B");
		fruit.eat();
		
	}
	public String factory(String fruitname) {
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}

}
