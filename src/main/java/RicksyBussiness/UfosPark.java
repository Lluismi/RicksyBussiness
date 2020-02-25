package RicksyBussiness;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
	
	private double fee = 500;
	private Map<String, String> flota = new HashMap<String, String>();
	
	public UfosPark() {}

	public double Fee() {
		return this.fee;
	}
	
	public Map<String, String> getFlota() {
		return this.flota;
	}

	public void add(String ovni) {
		flota.put(ovni, ovni);
		flota.put(ovni, ovni);
	}
	
	public void dispatch(CreditCard abradolph) {
		for (String ovni : flota.keySet()) {
			if(flota.get(ovni) != null) {
				abradolph.pay(fee); {
					flota.put(ovni, abradolph.number());
					break;
				}
			}
		}
	}
	
	public String getUfoOf(String f) {
		return null;
	}
	
}
