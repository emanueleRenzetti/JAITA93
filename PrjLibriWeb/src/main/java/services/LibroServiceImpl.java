package services;

import java.util.List;

import model.Libro;
import repos.LibroDAO;
import repos.LibroDAOImpl;

public class LibroServiceImpl implements LibroService {
	
	LibroDAO dao = new LibroDAOImpl ();

	@Override
	public List<Libro> getLibri() {
		return dao.findAll();
	}

	@Override
	public void addLibro(Libro l) {
		dao.addLibro(l);
		
	}

}
