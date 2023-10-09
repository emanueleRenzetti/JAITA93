package floww;

public class Canzone {

	String cantante;
	String titolo;
	
	// alt + shift + s  --> generate constructor using fields 
	//click destro -> source -> generate constructor using fields
	public Canzone(String cantante, String titolo) {
		super();// con super sto chiamando chi c'è sopra di me - riguarda un discorso di ereditarietà
				//la clase object è troppo generica, per questo ci creiamo le nostre classi
				//super succederà in ogni caso, anche se non lo mettiamo
				//eclipse lo mette in automatico, anche se non serve
		this.cantante = cantante;
		this.titolo = titolo;
	}
	
	//il metodo toString rappresenta un oggetto, come ad esempio la canzone, in formato di string
	//se poi la canzone vogliamo mandarla a schermo dobbiamo fare anche il to string
	@Override
	public String toString() {
		return "Canzone [cantante=" + cantante + ", titolo=" + titolo + "]";
	}
	
	

}//class
