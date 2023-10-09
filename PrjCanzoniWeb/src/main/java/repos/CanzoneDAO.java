package repos;

import java.util.List;

import model.Canzone;

public interface CanzoneDAO {
	
	String FIND_ALL = "SELECT * FROM canzoni"; //SICCOME è UNA COSTANTE DEVO DARGLI SUBITO IL VALORE
	String FIND_BY_ID = "SELECT * FROM canzoni WHERE id = ?";
	String ADD = "INSERT INTO canzoni (titolo, cantante) values (?,?)";
	String UPDATE = "UPDATE canzoni SET titolo=?, cantante=? WHERE id=?";
	String DELETE_BY_ID = "DELETE FROM canzoni WHERE id = ?";
	
	List<Canzone> findAll();
	Canzone findById(int id);
	void addCanzone(Canzone c);
	void updateCanzone(Canzone c);
	void deleteCanzone(Canzone c);
	
	//PPC = programmazione per contratto. 
	
	
	
}
