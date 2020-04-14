package Sclone;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFruitStore.Add(3,new Apple());
		MyFruitStore.Add(4,new Banana());
		MyFruit fru = MyFruitStore.Get(3);
		fru.Display();
	}

}
