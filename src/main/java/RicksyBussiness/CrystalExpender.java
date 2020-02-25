package RicksyBussiness;

public class CrystalExpender {
	
	private int stock = 0;
	private double itemCost = 0;
	
	public CrystalExpender(int stock, double itemCost) {
		this.stock = stock;
		this.itemCost = itemCost;
	}
	
	public int getStock() {
		return stock;
	}
	
	public double getItemCost() {
		return itemCost;
	}
}
