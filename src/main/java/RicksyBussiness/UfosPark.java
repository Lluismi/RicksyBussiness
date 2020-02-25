package RicksyBussiness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UfosPark {
	
	private double fee = 500;
	private Map<String, String> flota = new HashMap<String, String>();
	
	public UfosPark() {}

	public void add(String ovni) {
		flota.put(ovni, ovni);
	}
	
	/* Error abradolph paga 2 ovnis pero solo tiene 1*/
	public void dispatch(CreditCard abradolph) {
		for (String ovni : flota.keySet()) {
			if(flota.get(ovni) != null) {
				abradolph.pay(fee);
					flota.put(ovni, abradolph.number());
					break;
			}else if(flota.get(ovni) == abradolph.number()) {
				break;
			}
		}
	}
	
	/* Error le da el mismo ovni a todos  y morty le cobra aunque no haya ovni para el*/
	public String getUfoOf(String number) {
		String NameOvni = null;
		for (String ovni : flota.keySet()) {
			if (flota.get(ovni) == number) {
				NameOvni = ovni;
			}
		}
		return NameOvni;
	}
	
	/* Error: Saca la lista de arriba abajo en vez de como pide la foto*/
	public String toString() {
		List<String> ovnis = new ArrayList<String>(flota.keySet());
		return ovnis.toString();
	}
}
