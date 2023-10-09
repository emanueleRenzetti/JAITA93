package floww;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Canzoni {

	public static void main(String[] args) {
	
		File f = new File("documenti/canzoni.txt");
		ArrayList<Canzone> hitlist = new ArrayList<Canzone>();// array di dimensione variabile
		
		try {
			Scanner input = new Scanner(f);
			
			while(input.hasNextLine()) {
				String rigaIntera = input.nextLine();
				String[] rigaSplittata = rigaIntera.split("\\|");// mettiamo \\ sennò | viene considerato carattere speciale
				String cantante = rigaSplittata[0];
				String titolo = rigaSplittata[1];
				
				Canzone c = new Canzone(cantante, titolo);
				hitlist.add(c); //ho aggiunto la canzone c alla mia lista di canzoni con .add
				
//				for (Canzone canzone : hitlist) {
//					System.out.println(c);	
//				}		
//				System.out.println(c);
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println("file non trovato, verifica il nome file"+e.getMessage());
		}
		
		System.out.println("La hitlist contiene "+ hitlist.size()+ " canzoni" );
		
		
		///////////// se vogliamo riprodurre una canzone casuale utilizziamo random
		
		Random random = new Random();
		int casuale = random.nextInt(hitlist.size());
		
		System.out.println(casuale);
		System.out.println("Adesso eseguiamo il brano");
		System.out.println(hitlist.get(casuale));
		
		
		
		
		
		
		
		
		
		/*
		 * passo 1: stampare la playlist un brano alla volta
		 * passo 2: chiedere all'utente se vuole salvare il brano nella playlist personale
		 * passo 3: se sì, salvarlo nella playlist, altrimenti passasre al brano successivo
		 * passo 4: scivere un file di testo che contiene la mia playlist
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
