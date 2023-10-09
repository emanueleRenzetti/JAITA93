package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {
	
	//STRUMENTI PER COLLEGARMI AL DB
	Collegamento db = new Collegamento();
	PreparedStatement ps; //qui lo dichiariamo solo
	ResultSet rs;
	

	@Override
	public List<Canzone> findAll() {
		List<Canzone> canzoni = new ArrayList<>();//vassoio vuoto
		try {
			this.ps = this.db.getConnessione().prepareStatement(FIND_ALL); //riempiamo di pastccini
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) { //RECORD PER RECORD
				int id = rs.getInt(1);//ESTRAGGO DAL RECORD CORRENTE IL CAMPO id
				String titolo = rs.getString("titolo"); //ESTRAGGO DAL RECORD CORRENTE IL CAMPO titolo //possiamo passare il nome del campo o numero colonna
				String cantate = rs.getString("cantante");//ESTRAGGO DAL RECORD CORRENTE IL CAMPO cantante
				
				Canzone c = new Canzone();
				c.setId(id);
				c.setTitolo(titolo);
				c.setCantante(cantate);
				
				canzoni.add(c);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return canzoni;// ritorniamo vassoio pieno
	}

	@Override
	public Canzone findById(int id) {
	
		return null;
	}

	@Override
	public void addCanzone(Canzone c) {
		
		try {
			this.ps = this.db.getConnessione().prepareStatement(ADD);
			this.ps.setString(1, c.getTitolo());
			this.ps.setString(2, c.getCantante());
			this.ps.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

}
