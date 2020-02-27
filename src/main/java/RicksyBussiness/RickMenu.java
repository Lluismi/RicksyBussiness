package RicksyBussiness;

public class RickMenu implements GuestDispatcher {
	
	private int stock = 100;
	private double priceMenu = 10;
	
	
	RickMenu() {}
	
	
	public void dispatch(CreditCard persona) {
		if (persona.pay(priceMenu) && stock > 0) {
			this.stock -= 1;
		}
	}
	
	int stock() {
		return this.stock;
	}
	
	
	@Override
	public String toString() {
		return "\nRickMenus pedidos:\n " + 
				"==========================================" + "\n" + 
				"Stock: " + stock + "\n";
	}
	
}
