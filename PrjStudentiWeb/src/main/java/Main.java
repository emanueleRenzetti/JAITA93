import java.util.ArrayList;

import controller.GestioneEsami;
import controller.LeggiFile;
import model.Esame;
import model.Materia;
import model.Studente;

public class Main {

	public static void main(String[] args) {

//		Studente s = new Studente("Oscar");
//		Materia m = new Materia("SQL");
//		
//		ArrayList<Studente> studentiLetti = LeggiFile.leggiFileStudenti("files/studenti.txt");
		
		GestioneEsami gestionale1 = new GestioneEsami();
		
//		gestionale1.addMateria("Cinese");
		
//		gestionale1.eliminaMateria(7);
		
//		gestionale1.modificaMateria("C#", 8);
		
		//caricaStudenti(studentiLetti, gestionale1);
		
//		gestionale1.inizializzaDalDatabase();
//		
//		for (Studente studente : gestionale1.getStudenti()) {
//			System.out.println(gestionale1.stampaStudente(studente));
//		}
//		
//		for (Materia m :  gestionale1.getInsegnamenti()) {
//			System.out.println(m);
//		}
//			
		
		Materia m = gestionale1.getInsegnamenti().get(0);
		Studente s = gestionale1.getStudenti().get(0);
		int voto = 28;
		Esame e = new Esame(s, m, voto);
		
		gestionale1.addEsame(e);

	}//fine metodo main

	private static void caricaStudenti(ArrayList<Studente> studentiLetti, GestioneEsami gestionale1) {
		for (Studente studente : studentiLetti) {
			gestionale1.addStudente(studente);
		}
	}
	
}
