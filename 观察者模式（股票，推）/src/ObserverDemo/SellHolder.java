package ObserverDemo;

import java.util.ArrayList;
import java.util.List;

public class SellHolder implements IStockHolder {
	private List<AStockPrice> attentionlist;
	private String name;
	
	public SellHolder(String name) {
		attentionlist = new ArrayList<AStockPrice>();
		this.name = name;
	}
	@Override
	public void update(AStockPrice asp) {
		// TODO Auto-generated method stub
		if(attentionlist.contains(asp)) {
			System.out.println(name);
			if(asp.getPrice_1() - asp.getPrice_2() > 0) {
				System.out.print(asp.code + ":");
				System.out.print("原价：" + asp.price_2 + "-现价：" + asp.price_1);
				System.out.println("股票涨了，不开心");
			}else {
				System.out.print(asp.code + ":");
				System.out.print("原价：" + asp.price_2 + "-现价：" + asp.price_1);
				System.out.println("股票跌了，开心");
			}
		}
	}

	@Override
	public void AddHolder(AStockPrice asp) {
		// TODO Auto-generated method stub
		attentionlist.add(asp);
		asp.Add(this);
	}

}
