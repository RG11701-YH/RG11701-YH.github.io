package ProxyDemo_2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IShowPic isp = new CRemoPic();
//		CLocalPicShow cpic = new CLocalPicShow(isp);
//		IShowPic localpic = (IShowPic)cpic.getProxyInstance();
//		localpic.ShowPic("AAA");
		ITestInterface ipic = new CTest();
		ITestInterface proxy = (ITestInterface) new CLocalPicShow(ipic).getProxyInstance();
		proxy.SendMessage("AAA");
	}

}
