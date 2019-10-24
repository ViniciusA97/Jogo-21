package Baralho;

public abstract class Cartas {

	protected String tipo;
	protected int valor;

	public Cartas(String naipe, int numeracao) {
		this.tipo=naipe;
		this.valor=numeracao;
	}
	public int getValor() {
		return this.valor;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
