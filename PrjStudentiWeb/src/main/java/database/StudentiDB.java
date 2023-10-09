package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Studente;

public class StudentiDB {
	
	Collegamento db = new Collegamento();
	ArrayList<Studente> studenti = new ArrayList<>();
	
	public void addStudente(Studente s) {
		String query="INSERT into studenti (nome) values(?)";
		try {
			PreparedStatement ps = db.getConnessione().prepareStatement(query);
			ps.setString(1, s.getNome());
			ps.execute();
			System.out.println("studente inserito");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Studente> getStudenti() {
		
		//svuota larraylist
		studenti.clear();
		//inizializza
		inizializza();
		return studenti;
	}

	public void inizializza() {
	
		try {
			Statement stat =  db.getConnessione().createStatement();
			
			ResultSet rs = stat.executeQuery("SELECT id, nome FROM studenti");
			
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String nome = rs.getString("nome"); // possiamo passare direttamente nome oppure 2, cioe la posizione in cui si stova il nome
				Studente temp = new Studente(id, nome);
				studenti.add(temp);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void eliminaStudenteById(int id) {
		String query="delete from studenti where id = ?";
		try {
			PreparedStatement ps = db.getConnessione().prepareStatement(query);
			ps.setInt(1, id);
			ps.execute();
			System.out.println("studente eliminato");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
	
	
}
