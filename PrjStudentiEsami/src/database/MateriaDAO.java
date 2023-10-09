package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Materia;

public class MateriaDAO {
	
	Collegamento db; //COME PRIMA COSA DOBBIAMO AVERE UN COLLEGAMENTO AL DB. E' UN OGGETTO CONCRETO CHE DOBBIAMO CREARE.
	ArrayList<Materia> materie;//CREO UN ARRAYILST. CONTENITORE DI MATERIE.
	Statement statement;//bisogno anche di un contenitore per portare istruzioni al db. Lo importiamo da java.sql.statement
	ResultSet rs; // SERVE PER MEMORIZZARE IL RISULTATO DI UNA QUERY AL DB. QUERY CHE PREVEDONO SOLO UN RISULTATO INDIETRO, QUINDI ISTRUZIONI SELECT. LE ALTRE STRUZIONI NON RITORNANO UN RESULT SET 

	//SE NON SCRIVIAMO NIENTE, DA DENTRO IL PACCHETTO DB TUTTE LE ALTRE CLASSI POSSONO LEGGERE E SCIRVERE PROPRIETA'. MENTRE E' PRIVATE PER TUTE LE ALTRE CLASSI FUORI DAL PACKAGE.

	
	//METODO COSTRUTTORE DEL COLLEGAMENTO
	public MateriaDAO() {
		this.db = new Collegamento();
		this.materie = new ArrayList<Materia>();
	}
	
	// CRUD
	
	// C - CREATE
	
	public Materia addMateria(String nome) {
		
		Materia m= new Materia(0, nome);
		
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("INSERT into materie (nome) values ('"+m.getNome()+"')");// PREPARE STATEMENT
			
			if(this.statement.getUpdateCount() == 1)
				System.out.println("RECORD INSERITO");
			else
				System.out.println("NON INSERITO");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return m;
	}
	
	
	//R - READ (RETRIEVE) - gettAll getMateriaById(int id) 

	//metodo getter di materie dell'arraylist. Serve per riempire l'arrraylist
	public ArrayList<Materia> getMaterie() throws SQLException {
		
		this.materie.clear(); //svuotiamo l'arraylist sennò quando chiamiamo il metodo getMaterie e ci sono già materie conta anche quelle già presenti e fa ripetizioni.
		
		this.statement = db.getConnessione().createStatement();
		this.rs = this.statement.executeQuery("SELECT id, nome from materie");
		
		while(this.rs.next()) { //next metodo che ritorna true finchè ci sono record. sennò ritorna false
			int id = this.rs.getInt(1);
			String nome = this.rs.getString(2);
			this.materie.add(new Materia(id,nome));// aggiungo la mteria all'AL
		}
		
		return materie;
	}
	
	
	//U - UPDATE
	
	public void updateMateria(String altroNome, int idRecord) {
		
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("UPDATE materie set nome = '"+altroNome+"' WHERE id = " + idRecord);
			
			if(this.statement.getUpdateCount() == 1)
				System.out.println("RECORD MODIFICATO");
			else
				System.out.println("RECORD NON MODIFICATO");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//D - DELETE
	
	public void deleteMateria(int id) {
		try {
			this.statement = db.getConnessione().createStatement();
			this.statement.execute("DELETE FROM materie WHERE id = " + id);
			
			if(this.statement.getUpdateCount() == 1)
				System.out.println("RECORD ELIMINATO");
			else
				System.out.println("RECORD NON INSERITO");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	





}//class
