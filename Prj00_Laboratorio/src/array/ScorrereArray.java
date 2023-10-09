package array;

public class ScorrereArray {

	public static void main(String[] args) {
		
		//modi per scrivere un array
		//int[] voti = new int [5];
		//oppure
		//int[] voti = new int[] {25,26,27,28,29};
		//oppure
		//int[] voti = {25,26,27,28,29};
		
		int[] voti = {25,26,27,28,29};
		
		//////////////////////////////////  for /////////////////////////////
		//ciclo for che parte da zero e va avanti 
//		for (int i = 0; i < voti.length; i++) {
//			System.out.println("il voto "+ i + " vale " + voti[i]);
//		}
		
		//ciclo for che parte dalla fine e va indietro
		for (int i = voti.length - 1; i >= 0; i--) {
			if ( voti[i] % 2 == 0 ) //se metto questa condizione mi stampa solo numeri pari
				System.out.println("il voto "+ i + " vale " + voti[i]);
		}
		
		////////////////////////////////////for each//////////////////////////
		for (int voto : voti) {
			System.out.println("il voto " + voto);
		// questo ciclo è veloce rispetto agli altri però scorre solo in una direzione (in avanti) e non ci da l'indice.
		}
		
		// try catch : per gestire le eccezioni
		
		
		
		
		

	}// main

}// class
