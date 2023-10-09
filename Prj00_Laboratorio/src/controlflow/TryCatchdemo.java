package controlflow;

public class TryCatchdemo {

	public static void main(String[] args) {
		
		// primo problema - out of bounds
//		String[] colori = {"giallo", "rosso", "verde"};
		
//		System.out.println(colori[-3]);
		
		//secondo problema - inseriamo System.err.println la differenza è solo il colore con err e possiamo mandare a schermo anche l'errore 
		
		int num1 = 0;
		int num2 = 0;
		
		try {
		int divisione = num1 / num2;
		} catch (Exception e) {
		System.err.println("eccezione!");
		System.err.println(e.getMessage());
		}
		
		
		System.out.println("programma terminato");
		
	}//main

}//class
