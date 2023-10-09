package presentation;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;
import services.LibroService;
import services.LibroServiceImpl;


@WebServlet("/provami")
public class MVCControler extends HttpServlet{

	LibroService service = new LibroServiceImpl(); 
	

	
	@Override 							//da client						//da server
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  //OVERRIDE DI HTTPSERVLET
		
		//response.getWriter().print("Hey sei connesso! Mi hai chiamato usando GET");
		
		//request.setAttribute("titoloPagina", "Il titolo di questa pagina è...");
		
		request.getRequestDispatcher("libri.jsp").forward(request, response); //come sendRedirect ma nella barra non si vedrà addCanzone ma sempre /provami
		//response.sendRedirect("libri.jsp");  		
		
	}

	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("titolo") != null) {  //prepara risposta
			String titolo = request.getParameter("titolo");
			int pagine = Integer.parseInt(request.getParameter("pagine"));
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			
			Libro l = new Libro();
			l.setTitolo(titolo);
			l.setPagine(pagine);
			l.setPrezzo(prezzo);
			
			service.addLibro(l);
		}
		
		doGet(request, response);  //invia risposta
	}




	public List<Libro> mostraLibri(){
		return service.getLibri();
	}

	public void addLibro(String titolo, int pagine, double prezzo) {
		
		Libro l = new Libro();
		l.setTitolo(titolo);
		l.setPagine(pagine);
		l.setPrezzo(prezzo);
		service.addLibro(l);
	}
	
}
