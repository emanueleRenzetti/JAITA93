package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Materia;
import model.Studente;

public class EsameDAO {
	
	Collegamento collegmento;
	Statement statement;//modulo per richieste al db. Non sempre è adatto. Ci sono casi dove devo passare query parametrihe in cui mi conviene usare prepared statement.
	PreparedStatement ps;// modulo pr richieste al db specializzato
	ResultSet rs;
	
	public EsameDAO() {
		this.collegmento = new Collegamento();
	}
	
	public void addEsame(Studente s, Materia m, int voto) {
		
		try {
			String query = "INSERT INTO esami (studente_id, materia_id, voto) values(?,?,?)"; //query pronta ma senza valori dentro. per questo si chiama prepared. lasciamo il compito di aggiungere info in un secondo momento
			this.ps = this.collegmento.getConnessione().prepareStatement(query);
			
			this.ps.setInt(1, s.getId());//bind parameter (collegare i parametri)
			this.ps.setInt(2, m.getId());
			this.ps.setInt(3, voto);
			this.ps.execute();
//			if (  ) {
//				System.out.println("Esame inserito con successo");
//			}else {
//				System.out.println("Esame non inserito");
//			}
			
			System.out.println("Esame inserito");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}
	
	
	
	
	
	

}
