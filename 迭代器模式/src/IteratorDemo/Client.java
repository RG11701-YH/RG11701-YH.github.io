package IteratorDemo;

public class Client {
	
	public static void display(Television tv) {
		TVIterator i = tv.createIterator();
		System.out.println("���ӻ�Ƶ����");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkyTv tv1 = new SkyTv();
		display(tv1);
	}

}
