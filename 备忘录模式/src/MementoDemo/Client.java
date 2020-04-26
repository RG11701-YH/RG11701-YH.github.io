package MementoDemo;

public class Client {
	private static int index = 0;
	private static CaretakerChess caretaker = new CaretakerChess();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OriginatorChess chess = new OriginatorChess(new MementoChess("��",2,2));
		play(chess);
		chess.SetX(3);
		play(chess);
		chess.SetY(6);
		play(chess);
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
	}

	private static void redo(OriginatorChess chess, int index) {
		// TODO Auto-generated method stub
		System.out.println("**********��������**********");
		chess.Restore(caretaker.getMem(index));
		index++;
		chess.Show();
	}

	private static void undo(OriginatorChess chess, int index) {
		// TODO Auto-generated method stub
		System.out.println("**********����**********");
		index--;
		chess.Restore(caretaker.getMem(index-1));
		chess.Show();
	}

	private static void play(OriginatorChess chess) {
		// TODO Auto-generated method stub
		index++;
		caretaker.AddMem(chess.SavetoMemento());
		chess.Show();
	}

}
