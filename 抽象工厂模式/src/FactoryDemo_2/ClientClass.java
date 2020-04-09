package FactoryDemo_2;

public class ClientClass {
	public static void main(String[] args) {
		AConF aconF = new AConF();
		AConV aconV = new AConV();
		Fruit afruit = aconF.ACreateF();
		Vegetables avegetables = aconV.ACreateV();
		afruit.eat_F();
		avegetables.eat_V();
   }
		
}
