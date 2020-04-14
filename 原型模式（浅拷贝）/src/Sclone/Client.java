package Sclone;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFruit fru1 = new Apple();
		MyFruit fru2 = (Apple)fru1.clone();
		fru1.Display();
		fru2.Display();
		System.out.println("fru1:" + fru1.hashCode());
		System.out.println("fru2:" + fru2.hashCode());
		System.out.println("fru1:" + fru1.toString());
		System.out.println("fru2:" + fru2.toString());
		System.out.println(fru1 == fru2);
		System.out.println(fru1.equals(fru2));
	}

}
