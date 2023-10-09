package services;

import java.util.List;

import model.Canzone;

public interface CanzoneService { //CAMERIERE CHE PORTA IL PIATTO
	
	List<Canzone> getCanzoni();
	void addCanzone(Canzone c);
	

}
