package Baralho;

public class BaralhoPolones extends Baralho {

	public BaralhoPolones() {
		super();
	}

	public void montaBaralho() {
		for(int i=1; i<=7; i++) {
			this.cartas.add(new CartasPolones("Vermelho", i));
		}
		for(int i=1; i<=7; i++) {
			this.cartas.add(new CartasPolones("Azul", i));
		}
		for(int i=1; i<=7; i++) {
			this.cartas.add(new CartasPolones("Vermelho", i));
		}
		for(int i=1; i<=7; i++) {
			this.cartas.add(new CartasPolones("Branco", 0));
		}
		for(int i=1; i<=7; i++) {
			this.cartas.add(new CartasPolones("Preto", 0));
		}
		this.embaralhaBaralho();
	}
	
	
}
