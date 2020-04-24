package ObserverDemo;

import java.util.ArrayList;
import java.util.List;

public abstract class AStockPrice {
	protected float price_1,price_2;
	protected String code;
	protected List<IStockHolder> stockHolderlist;
	
	public void Add(IStockHolder Ish) {
		stockHolderlist.add(Ish);
	}
	
	public void Remove(IStockHolder Ish) {
		stockHolderlist.remove(Ish);
	}
	
	public AStockPrice(String code) {
		this.code = code;
		price_1 = price_2 = 0;
		stockHolderlist = new ArrayList<IStockHolder>();
	}

	public float getPrice_1() {
		return price_1;
	}

	public void setPrice_1(float price_1) {
		this.price_1 = price_1;
		notifyHolder();
	}

	public abstract void notifyHolder();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AStockPrice other = (AStockPrice) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	public float getPrice_2() {
		return price_2;
	}

	public void setPrice_2(float price_2) {
		this.price_2 = price_2;
	}
	
	
	
}
