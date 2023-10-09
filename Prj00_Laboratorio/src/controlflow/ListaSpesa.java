package controlflow;

import java.io.File; //io = input output
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListaSpesa {

	public static void main(String[] args) {
		
		File f = new File("documenti/listaSpesa.txt");
		
		try {
			Scanner input = new Scanner(f);
			
			while(input.hasNextLine()) {// metodo che verifica se ci sono altre righe da leggere
				System.out.println(input.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println("file non trovato, verifica il nome file"+e.getMessage());
		}
		
		
		
		
		
		
		
	}//main

}//class
