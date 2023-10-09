package model;

import java.time.LocalDate;

public class Todo {
	
	private LocalDate data;
	private String descrizione;
	private boolean fatto;
	
	
	/**
	 * Costruttore del todo, passare in argomento la descrizione
	 * @param Descrizione : la cosa da fare o comprare
	 */
	public Todo(String descrizione) {
		this.data = LocalDate.now();
		this.descrizione = descrizione;
		this.fatto = false;
		
	}
	
	public void completa() {
		this.fatto = true;
	}

	@Override
	public String toString() {
		return "Todo [data=" + data + ", descrizione=" + descrizione + ", fatto=" + fatto + "]";
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isFatto() {
		return fatto;
	}

	public void setFatto(boolean fatto) {
		this.fatto = fatto;
	}
	
	
	
	
	

}//class
