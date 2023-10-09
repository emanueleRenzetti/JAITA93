package repos;

import java.util.List;

import model.Serie;

public interface SerieDAO {
	
	//sono implicitamente public e final
	String ADD = "insert into serie (titolo, genere, rating) values (?,?,?)";
	String FIND_ALL = "select * from serie";
	String FIND_BY_ID = "select * from serie where id = ?";
	String FIND_BY_GENERE = "select * from serie where genere = ?";
	
	void addSerie(Serie s); //mi passa direttamnte la serie
	void addSerie(String titolo, String genere, double rating);// mi da gli ingredienti per fare una serie
	
	List<Serie> getSerie(); //otterrò una list di serie qcon il metodo getSerie()
	Serie getSerieById(int id);// qui si rivece solo una serie a seconda del suo id
	List<Serie> getSerieByGenere(String genere);// riceverà le serie in base al genere che hanno
	
}
