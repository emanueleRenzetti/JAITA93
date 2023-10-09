package view;

import java.util.Scanner;

public class DistributoreView {
	
	private Scanner scanner = new Scanner(System.in);
	
	final String MSG_SCELTA = "Scegli una bevanda";
	final String MSG_DENARO = "Inserisci credito ";
	
	public String showMenu() {
		String s = "";
		s += "A1 Caffè: 0.50€ \n";
		s += "A2 Caffè lungo: 0.55€ \n";
		s += "A3 Cappuccino: 0.60€ \n";
		s += "A4 Cioccolata: 0.70€ \n";
		s += "A5 Thè: 0.75€ \n";
		return s;
		
	}
	public String sceltaBevanda() {
		String s="";
		System.out.println(MSG_SCELTA);
		s = scanner.nextLine();
		return s;
		
	}
	public double chiedisoldi() {
		double d = 0;
		// TODO: SCRIVERE UNA LOGICA PER CARICARE IL CREDITO -> WINDOW - SHOW VIEW - OTHER - GENERAL - TASK
		return d;
		
	}

}//class
