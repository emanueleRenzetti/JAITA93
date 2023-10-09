package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroDAOImpl  implements LibroDAO {
	
	Collegamento db = new Collegamento();
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public List<Libro> findAll() {
		List<Libro> libri = new ArrayList<>();
		try {
			this.ps = this.db.getConnessione().prepareStatement(FIND_ALL); 
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) { 
				int id = rs.getInt(1);
				String titolo = rs.getString("titolo"); 
				int pagine = rs.getInt("pagine");
				double prezzo = rs.getDouble("prezzo");
				
				Libro l = new Libro();
				l.setId(id);
				l.setTitolo(titolo);
				l.setPagine(pagine);
				l.setPrezzo(prezzo);
				
				libri.add(l);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libri;
	}

	@Override
	public Libro findById(int id) {
	
		return null;
	}

	@Override
	public void addLibro(Libro l) {
		
		try {
			this.ps = this.db.getConnessione().prepareStatement(ADD);
			this.ps.setString(1, l.getTitolo());
			this.ps.setInt(2, l.getPagine());
			this.ps.setDouble(3, l.getPrezzo());
			this.ps.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateLibro(Libro l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLibro(Libro l) {
		// TODO Auto-generated method stub

	}

}
