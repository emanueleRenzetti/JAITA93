<%@page import="model.Studente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.GestioneEsami"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	
		<h1>Studenti</h1>
		
		<div class="row">
			<form action="" method="post">
				<div class="mb-3 form-check col-4">
					<input type="submit" value="aggiungi" class="btn btn-success">
				</div>
				<div class="mb-3 form-check col-4">
					<input type="text" name="nomeStudente" placeholder="Nome Studente">
				</div>	
			</form>
		</div>
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Id</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Azione</th>
		    </tr>
		  </thead>
		  <tbody>
		  
		  	<% GestioneEsami gestionale = new GestioneEsami(); // controller %> 
		  	
		  	<%
		  		if (request.getParameter("nomeStudente") != null) {
		  			String nome = request.getParameter("nomeStudente");
		  			//out.print("Vuoi aggiungere lo studente " + nome);
		  			
		  			gestionale.addStudente(new Studente(0, nome)); //metto 0 perche sarà il db a dare l'id corretto con l'autoincrement
		  		}
		  	
		  		if (request.getParameter("elimina") != null && request.getParameter("user") != null ) {
		  			int id = Integer.parseInt(request.getParameter("user"));
		  			gestionale.eliminaStudenteById(id);
		  		}
		  	%>
			<% ArrayList<Studente> studenti = gestionale.getStudenti(); %>
			<% for (Studente s : studenti) { %>
		  
		    <tr>
		      <td><%= s.getId() %></td>
		      <td><%= s.getNome() %></td>
		      <td>
			      <form method="post">
			      	<input type="hidden" name="user" value="<%= s.getId() %>">
			      	<input class="btn btn-danger" type="submit" value="elimina" name="elimina">
			      </form>
		      </td>
		    </tr>
		    
		    <% } %>

		  </tbody>
		</table>
		
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>