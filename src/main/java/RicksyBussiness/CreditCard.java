package RicksyBussiness;

public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private double credit = 3000;
	private final String SYMBOL = "EZI";
	
	/* Constructor */
	
	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}
	
	/* getters */
	
	public String number() {
		return this.number;
	}
	
	
	public double credit() {
		return this.credit;
	}
	
	/* Comprueba si persona tiene credito para pagar
	 * si tiene devuelve true
	 * si no tiene devuelve false */
	
	public boolean pay(double creditapagar) {
		if (credit() != 0) {
			this.credit -= creditapagar;
			return true;
		}else {}
		return false;
	}
	
	@Override
	public String toString() {
		return "\n" + "Owner: " + this.owner + "\n" + 
                "Number: " + number() + "\n" +
                "Credit: " + credit() + this.SYMBOL + "\n";
	}
}
