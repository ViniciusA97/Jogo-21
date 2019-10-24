package Baralho;

import java.util.ArrayList;
import java.util.Collections;
public abstract class Baralho {

	protected ArrayList<Cartas> cartas;
	
	public Baralho() {
		cartas = new ArrayList<Cartas>();
	}
	
	public abstract void montaBaralho();
	
	public void embaralhaBaralho() {
		Collections.shuffle(this.cartas);
	}
	
	public Cartas getUltimaCarta() {
		Cartas usual = this.cartas.get(this.cartas.size()-1);
		this.cartas.remove(this.cartas.size()-1);
		return usual;
	}
	
}
