package ObserverDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AStockPrice futures1 = new StockFutures("111");
		AStockPrice futures2 = new StockFutures("222");
		AStockPrice futures3 = new StockFutures("333");
		
		AStockPrice common4 = new StockCommon("444");
		AStockPrice common5 = new StockCommon("555");
		AStockPrice common6 = new StockCommon("666");
		
		IStockHolder Buy1 = new BuyHolder("Buy1");
		IStockHolder Buy2 = new BuyHolder("Buy2");
		IStockHolder Buy3 = new BuyHolder("Buy3");
		
		IStockHolder Sell1 = new SellHolder("Sell1");
		IStockHolder Sell2 = new SellHolder("Sell2");
		IStockHolder Sell3 = new SellHolder("Sell3");
		
		Buy1.AddHolder(futures1);
		Buy1.AddHolder(futures2);
		Buy1.AddHolder(common4);
		
		Buy2.AddHolder(futures1);
		Buy2.AddHolder(futures3);
		Buy2.AddHolder(common5);
		
		Buy3.AddHolder(futures2);
		Buy3.AddHolder(futures3);
		Buy3.AddHolder(common6);
		
		Sell1.AddHolder(futures1);
		Sell1.AddHolder(futures2);
		Sell1.AddHolder(common4);
		
		Sell2.AddHolder(futures1);
		Sell2.AddHolder(futures3);
		Sell2.AddHolder(common5);
		
		Sell3.AddHolder(futures2);
		Sell3.AddHolder(futures3);
		Sell3.AddHolder(common6);
		
		for(int i=0;i>-5;i--) {
			futures1.setPrice_1(1+i);
			futures2.setPrice_1(1+i);
			futures3.setPrice_1(1+i);
			
			common4.setPrice_1(1+i);
			common5.setPrice_1(1+i);
			common6.setPrice_1(1+i);
		}
	}

}
