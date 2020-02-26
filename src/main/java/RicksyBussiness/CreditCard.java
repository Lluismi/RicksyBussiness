package RicksyBussiness;

public class CreditCard {
	
	private String owner = null;
	private String number = null;
	private double credit = 3000;
	private final String SYMBOL = "EZI";
	
	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}

	public String number() {
		return this.number;
	}
	
	public double credit() {
		return this.credit;
	}
	
	public boolean pay(double creditapagar) {
		if (credit() - creditapagar != credit) {
			this.credit -= creditapagar;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "\n" + "Owner: " + this.owner + "\n" + 
                "Number: " + number() + "\n" +
                "Credit: " + credit() + this.SYMBOL + "\n";
	}
}
