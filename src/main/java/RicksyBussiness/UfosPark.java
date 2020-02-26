package RicksyBussiness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
	
	private double fee = 500; 
	private Map<String, String> flota = new HashMap<String, String>();
	
	/* Constructor */
	
	public UfosPark() {}
	
	/* Añade una key "ovni" con valor "null" */
	
	public void add(String ovni) {
		flota.put(ovni, null);
	}
	
	/* Recorre el HashMap, si ovni es igual a "null" llama al metodo pay, 
	 * si tiene dinero paga y se le asigna el ovni, 
	 * comprueba si esa persona ya tiene un ovni */
	
	public void dispatch(CreditCard persona) {
		for (String ovni : flota.keySet()) {
			if(flota.get(ovni) == null) {
				if (persona.pay(fee)) {
					flota.put(ovni, persona.number());
				}
			} if (flota.get(ovni) == persona.number()) {
				break;
			}
		}
	}
	
	/* Devuelve ovni asignado a "persona" */
	
	public String getUfoOf(String number) {
		String NameOvni = null;
		for (String ovni : flota.keySet()) {
			if (flota.get(ovni) == number) {
				NameOvni = ovni;
			}
		}
		return NameOvni;
	}
	
	@Override
	public String toString() {
		List<String> ovnis = new ArrayList<String>(flota.keySet());
		return ovnis.toString();
	}
}
