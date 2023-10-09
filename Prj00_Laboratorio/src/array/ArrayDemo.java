package array;

public class ArrayDemo {

	public static void main(String[] args) {
	
		
		int[] voti = new int[5]; //inizializzazione lunga
		voti [0] = 25;
		voti [1] = 26;
		voti [2] = 27;
		voti [3] = 28;
		voti [4] = 29; 
		// questa è l'inizializzazione lunga e si fa in due momenti. prima una scatola vuota, poi dico cosa c'è dentro.
		
		int[] voti2 = {25, 26, 27, 28, 29}; // iniziailzzazzione short
		
		// questo è il modo corto per farlo. posso usarlo solo se so già prima cosa va dentro l'array.
		
		double totale = 0;
		
		for (int i = 0; i < voti2.length; i++) {
			System.out.println("Il valore di i è: " + i);
			totale +=voti2[i];
			//System.out.println(voti2[i]);
			System.out.println("Il voto è: " + voti2[i]);
		
		}
		
		double media = totale / voti2.length;
		
		System.out.println("La media aritmetica dei voti è: " + media);

	}

}
