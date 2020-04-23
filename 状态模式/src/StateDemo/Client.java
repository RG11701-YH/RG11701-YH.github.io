package StateDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadContext tc = new ThreadContext();
		tc.start();
		tc.getCpu();
//		tc.suspend();
		tc.stop();
	}

}
