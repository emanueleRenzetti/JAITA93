package presentation;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.LibroService;
import services.LibroServiceImpl;

@WebServlet("/api/libri")
public class RESTControler extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private LibroService service = new LibroServiceImpl();
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("application/json"); 
		
		
		
		
		JSONArray array = new JSONArray(service.getLibri());
		
		response.getWriter().print(array.toString());
		
	}

}
