package controlflow;

import java.util.Scanner;

import array.WhileLoop;

public class Menu {

	public static void main(String[] args) {
	
		//////////////////////// WHILE /////////////////////////
		Scanner input = new Scanner(System.in);
		boolean gira = true;
		
		while (gira) {
			System.out.println("Ciao sono chatgpt :)");
			System.out.println("cosa vuoi fare?");
			
			String risposta = input.nextLine();
			
			System.out.println(risposta);
			
			if (risposta.equals("esci")){
				System.out.println("Game over");
				gira = false;
			}
		}
		
		
		
		
		

	}//main

}//class
