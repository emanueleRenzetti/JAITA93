package interfacce;
import java.io.Serializable;

public class NegozioAlimentari extends Negozio implements ContrattoAlimenti, Serializable { //serializabile non ha metodi da implementare, ma se non la implemento il mio oggett non è serializzabile. quest interfaccia non mi obbliga a fare niente.
@Override
	public void conservazione() {
		System.out.println("Conservo in frigorifero");
		
	}
}






