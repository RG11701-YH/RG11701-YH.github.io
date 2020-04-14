package SingletonDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFruit fru1 = new Apple();
		MyFruit fru2 = new Banana();
		MyFruitStore mfs = MyFruitStore.Getfruitstore();
		MyFruitStore mfs2 = MyFruitStore.Getfruitstore();
		mfs.Add(1, fru1);
		mfs.Add(2, fru2);
		mfs.Add(3, new Apple());
		mfs.Add(4, new Banana());
		MyFruit fru = (MyFruit)mfs.Get(3);
		fru.Display();
		System.out.println("mfs: " + mfs.toString());
		System.out.println("mfs2: " + mfs2.toString());
	}

}
