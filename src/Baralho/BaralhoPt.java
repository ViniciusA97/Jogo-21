package Baralho;

public class BaralhoPt extends Baralho {

	public BaralhoPt() {
		super();
	}

	public void montaBaralho() {
		for(int i=1; i<14; i++) {
			this.cartas.add(new CartasPt("Paus",i));
		}
		for(int i=1; i<14; i++) {
			this.cartas.add(new CartasPt("Ouros",i));
		}
		for(int i=1; i<14; i++) {
			this.cartas.add(new CartasPt("Copas",i));
		}
		for(int i=1; i<14; i++) {
			this.cartas.add(new CartasPt("Espadas",i));
		}
		this.embaralhaBaralho();
	}
	
	
}
