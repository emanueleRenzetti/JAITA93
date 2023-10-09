import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestoreEsami {

	public static void main(String[] args) {
		ArrayList<Studente> studenti = new ArrayList<>();
		ArrayList<Materia> materie = new ArrayList<>();
		ArrayList<Esame> esami = new ArrayList<>();
		
		File f = new File("files/studenti.txt");
		File f2 = new File("files/materie.txt");
		
		try {Scanner input = new Scanner(f);
			while(input.hasNextLine()) {
				String studente = input.nextLine();
				String[] studenteSplittato = studente.split(",");
				int id = Integer.parseInt(studenteSplittato[0]);
				String nome = studenteSplittato[1];
				
				Studente s = new Studente(id, nome);
				studenti.add(s);
				System.out.println(s);
			}
								
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {Scanner input = new Scanner(f2);
		while(input.hasNextLine()) {
			String materia = input.nextLine();
			String[] materiaSplittato = materia.split(",");
			int codice = Integer.parseInt(materiaSplittato[0]);
			String nome = materiaSplittato[1];
			
			Materia m = new Materia(codice, nome);
			materie.add(m);
			System.out.println(m);
		}
							
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for (Studente s : studenti) {
			
			System.out.println("inserisci il voto di " + s.getNome());
			
			for(Materia m : materie) {
				System.out.println("voto di " + m.getNome());
				sc.nextInt();
				esami.add(null);
					
			}
			
		}
		

	}//main
	


}//class
