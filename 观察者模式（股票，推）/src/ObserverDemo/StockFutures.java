package ObserverDemo;

public class StockFutures extends AStockPrice {

	public StockFutures(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notifyHolder() {
		// TODO Auto-generated method stub
		System.out.println("期货更新了-" + code + "：" + price_1);
		for(IStockHolder ish : stockHolderlist) {
			ish.update(this);
		}
		price_2 = price_1;
	}

}
