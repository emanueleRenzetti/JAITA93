//CLASSE PER AGGIUNGERE DATI NEL DATA BASE E LEGGERLI


package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; //statement : è come se fosse un foglio dove scrivo istruzioni per il database


import model.Todo;

public class TodoDatabase {
	
	//con i seguenti tre parametri posso ottenere una connessione
	public final String HOST = "jdbc:mysql://localhost:3306/generation"; //jdbc: java databse connectivity
	public final String USER = "app_java";
	public final String PASS = "java_2023!";
	
	private Connection conn;// mi serve per poter portare una query al database
	
	public void connetti() { //qui cerchiamo di fare la connessione
		
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("connessi al db");
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore alla connessione al db: " + e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public void addTodo(String descrizione){
		try {
			Todo t = new Todo(descrizione);
			Statement stat = conn.createStatement();//con questo statment possiamo eseguire una query
			
			String querySql = "insert into todo (data,descrizione,fatto) values('"+t.getData()+"','" + t.getDescrizione()+"',0)";
			stat.execute(querySql);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
}//class
