package RicksyBussiness;

import java.util.ArrayList;
import java.util.List;

public class Receptivo {
	
	List<GuestDispatcher> observers = new ArrayList<GuestDispatcher>();
	
	/* Constructor */
	
	public Receptivo() {}
	
	/* Añade el pack a la lista observers */
	
	public void registra(GuestDispatcher packbievenida) {
		observers.add(packbievenida);
	}
	
	/* Por cada persona despachada se le da un pack de bienvenida */
	
	public void dispatch(CreditCard persona) {
		for (GuestDispatcher personainvitada : observers) {
			personainvitada.dispatch(persona);
		}
	}
}
