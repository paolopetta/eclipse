import java.util.ArrayList;

public class Purse {

	private ArrayList<Coin> coins;
	private double total;
	private int numCoins;
	
	/**
	 * costruttore, inizializzo tutto a 0
	 */
	public Purse() {
		coins= new ArrayList<Coin>();
		total= 0;
		numCoins= 0;
	}
	
	public double getTotal() {
		return total;
	}
	
	public int getNum() {
		return numCoins;
	}
	
	public void add (Coin aCoin) {
		coins.add(aCoin);
		total += aCoin.daiValore();
		numCoins++;
		}
	
	public Coin getMin() {
		Coin min = coins.get(0);
		
		for (Coin coin : coins) {
			if(coin.daiValore() < min.daiValore())
				min = coin;
		}
		return min;
	}
	public Coin getMax() {
		Coin max = coins.get(0);
		
		for(Coin coin :coins) {
			if(coin.daiValore() > max.daiValore())
				max = coin;
		}
		return max;
	}
	
	public int findCoin(Coin find) {
		
		for (Coin coin: coins) {
			if (coin.daiValore() == find.daiValore())
				return coins.indexOf(coin);
		}
		return -1;
	}
	public void remove(Coin aCoin) {
		coins.remove(aCoin);
		total = total -aCoin.daiValore();
		numCoins = numCoins-1;
	}
	
}
