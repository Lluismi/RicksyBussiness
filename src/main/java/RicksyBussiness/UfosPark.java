package RicksyBussiness;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {
	
	private int fee = 500;
	private Map<String, Integer> flota = new HashMap<String, Integer>();
	
	public UfosPark() {}

	public int getFee() {
		return this.fee;
	}
	
	public Map<String, Integer> getFlota() {
		return this.flota;
	}

	public void add(String ovni) {
		flota.put(ovni, 1);
		flota.put(ovni, 2);
	}
	
	public String getUfoOf(String f) {
		return null;
	}
	
}
