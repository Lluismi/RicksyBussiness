package RicksyBussiness;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 0;
	private double itemCost = 50;
	
	/* Constructor */
	
	CrystalExpender(int stock, double itemCost) {
		this.stock = stock;
		this.itemCost = itemCost;
	}
	
	/* Comprueba si persona tiene dinero en credit
	 * si tiene comprueba si hay los packs en stock
	 * son mayores de 0 y resta 1 a stock */
	
	public void dispatch(CreditCard persona) {
		if (persona.pay(itemCost) && stock > 0) {
			stock -= 1;
		}
	}
	
	int stock() {
		return stock;
		
	}

	@Override
	public String toString() {
		return "Stock: " + stock + "\n" +
				"cost: " + itemCost;
	}
	
}
