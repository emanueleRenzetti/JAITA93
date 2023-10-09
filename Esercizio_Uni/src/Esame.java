
public class Esame {
	private Studente studente;
	private Materia materia;
	private int voto;
	
	public Esame(Studente studente, Materia materia, int voto) {
		super();
		this.studente = studente;
		this.materia = materia;
		this.voto = voto;
	}
	

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	
//	private ArrayList<Voto> votiStudente = new ArrayList();
//	
//    public double mediaVoto(){
//        double somma = 0;
//        
//        for (Esame voto : votiStudente) {
//            somma += voto.getVoto();   
//        }
//        return somma/votiStudente.size();
//    }
//	

}
