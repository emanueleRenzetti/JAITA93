package interfacce;

//questa è una classe concreta
public class Negozio implements Contratto {
	
	//devo implementare tutti i metodi dell'interfaccia, per questo abbiamo il metodo brandizzare. sono obbligato

	@Override
	public void brandizzare() {
		System.out.println("Metto un totem e faccio una vetrina brandizzata");
		
	}
	
	

}


