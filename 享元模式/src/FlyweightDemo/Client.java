package FlyweightDemo;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rm = new Random();
		PieceFactory pFactory = new PieceFactory();
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				APiece p;
				if(rm.nextInt() % 2 == 0) {
					p = pFactory.GetPiece("白棋子");
				}else {
					p = pFactory.GetPiece("黑棋子");
				}
				p.Play(rm.nextInt(19), rm.nextInt(19));
			}
		}
		System.out.println("总共棋子的个数为："+pFactory.GetPieceCount());

	}

}
