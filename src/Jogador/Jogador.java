package Jogador;

import java.util.ArrayList;

import Baralho.Cartas;


public class Jogador {

	private String nome;
	private ArrayList<Cartas> cartas;
	private static Jogador instance;
	
	private Jogador() {
		cartas = new ArrayList<Cartas>();
	}
	
	public static Jogador getInstance() {
		if(instance==null) {
			instance = new Jogador();
		}
		return instance;	
	}
	
	public int contaPontos() {
		int soma = 0;
		for (Cartas i : cartas) {
			soma += i.getValor();
		}
		return soma;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void addCarta(Cartas carta) {
		this.cartas.add(carta);
	}
	public void zeraCarta() {
		this.cartas=new ArrayList<Cartas>();
	}
}
