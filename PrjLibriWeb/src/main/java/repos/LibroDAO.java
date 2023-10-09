package repos;

import java.util.List;

import model.Libro;

public interface LibroDAO {

	String FIND_ALL = "SELECT * FROM libri3"; //SICCOME è UNA COSTANTE DEVO DARGLI SUBITO IL VALORE
	String FIND_BY_ID = "SELECT * FROM libri3 WHERE id = ?";
	String ADD = "INSERT INTO libri3 (titolo, prezzo, pagine) values (?,?)";
	String UPDATE = "UPDATE libri3 SET titolo=?, prezzo=?, pagine=?, WHERE id=?";
	String DELETE_BY_ID = "DELETE FROM libri3 WHERE id = ?";
	
	List<Libro> findAll();
	Libro findById(int id);
	void addLibro(Libro l);
	void updateLibro(Libro l);
	void deleteLibro(Libro l);
	
}
