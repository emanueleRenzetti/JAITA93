package games;

public class Dado {
	
	public int facce;
	
	public Dado() {
		
		this.facce = 6;
		
	}
	
	public int launch() {
		int i = 1;
		
		// devo calcolare un valore casuale tra 1 e 6.
		
		double casuale = Math.random(); // casuale tra 0.0 e minore di 1
		i = (int)(casuale * facce)+1;

		return i;
		
	}
	

}
