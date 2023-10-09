package model;

public class Bevanda {
	
	public String nome;
	public double prezzo;
	
	public String getMessaggio() {
		String s = "";
		s += "Scontrino \n";
		s += "Nome \n";
		s += nome + " \n";
		s += "Prezzo \n";
		s += prezzo + " € \n";
		
		return s;
		
	}

}
