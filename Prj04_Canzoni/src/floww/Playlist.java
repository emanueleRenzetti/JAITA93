package floww;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Playlist {

	public static void main(String[] args) {
	

		File f = new File("documenti/canzoni.txt");
		ArrayList<Canzone> hitlist = new ArrayList<Canzone>();// array di dimensione variabile
		
		try {
			Scanner input = new Scanner(f);
			
			while(input.hasNextLine()) {
				String rigaIntera = input.nextLine();
				String[] rigaSplittata = rigaIntera.split("\\|");// mettiamo \\ ennò\ viene considerato carattere speciale
				String cantante = rigaSplittata[0];
				String titolo = rigaSplittata[1];
				
				Canzone c = new Canzone(cantante, titolo);
				hitlist.add(c); //ho aggiunto la canzone c alla mia lista di canzoni con .add
				
				
				
				//System.out.println(c);
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println("file non trovato, verifica il nome file"+e.getMessage());
		}
		
		System.out.println("La hitlist contiene "+ hitlist.size()+ " canzoni" );
		
//		for (Canzone c : hitlist) {
//			System.out.println(c);	
//		}
		
		
		
		
		
		/*
		 * passo 1: stampare la playlist un brano alla volta
		 * passo 2: chiedere all'utente se vuole salvare il brano nella playlist personale
		 * passo 3: se sì, salvarlo nella playlist, altrimenti passasre al brano successivo
		 * passo 4: scivere un file di testo che contiene la mia playlist
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Canzone> playlist = new ArrayList<Canzone>();// portacd vuoto
		
		for (Canzone canzone : hitlist) {
			System.out.println(canzone);
			System.out.println("Vuoi salvare questa canzone nella playlist?");
			String risposta = sc.nextLine();
			
			if (risposta.equals("s")) {
				playlist.add(canzone);
			
			}
			
		}
		
		//System.out.println("nella mia playlist ci sono "+ playlist.size()+ " canzoni.");
		
		File miaplaylist = new File("documenti/miaplaylist.txt");
		try {
			PrintWriter download = new PrintWriter(miaplaylist);
			for (Canzone canzone : playlist) {
				download.println(canzone);
			}
			download.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}//main

}//class
