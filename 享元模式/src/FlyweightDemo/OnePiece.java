package FlyweightDemo;

public class OnePiece extends APiece{

	public OnePiece(String inKind) {
		super(inKind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Play(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("��" + inKind + "����(" + x + "," + y + ")��λ�á�");
	}

}
