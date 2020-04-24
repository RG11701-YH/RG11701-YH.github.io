package ObserverDemo;

public class StockCommon extends AStockPrice {

	public StockCommon(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notifyHolder() {
		// TODO Auto-generated method stub
		System.out.println("普通股票更新了-" + code + "：" + price_1);
		for(IStockHolder ish : stockHolderlist) {
			ish.update(this);
		}
		price_2 = price_1;
	}

}
