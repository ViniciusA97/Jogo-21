package FacadeComunicacao;

import Baralho.*;
import Jogador.Jogador;

public class FachadaFuncoes {

	private static FachadaFuncoes instance;
	private Jogador j = Jogador.getInstance();
	private FachadaFuncoes() {}
	
	public static FachadaFuncoes getInstance() {
		if(instance== null) {
			instance = new FachadaFuncoes();
		}
		return instance;
	}
	
	public Baralho CriaBaralho(int i) throws ExceptionContagem {
		
		if( i !=1 && i!= 2) throw new ExceptionContagem();
		
		Baralho baralho;
		
		if(i == 1) {
			baralho = new BaralhoPolones();
		
		}else {
			
			baralho = new BaralhoPt();
		}
		baralho.montaBaralho();
		baralho.embaralhaBaralho();
		return baralho;
	}
	
	public boolean setJogada(Baralho b) throws ExceptionContagem {
		
		FachadaComunicacao fachada = FachadaComunicacao.getInstance();
		boolean cond=true;
		
		int num= fachada.inputInt("Escolha :\n"
				+ "1- Puxar carta;"
				+ "\n2- Parar de Jogar"
				+ "\n3- Contagem de Pontos;");
		
		if(num<1 && num>3) throw new ExceptionContagem();
		
		else if(num == 1) {
			Cartas carta = b.getUltimaCarta();
			j.addCarta(carta);
			System.out.println("Carta do tipo: "+ carta.getTipo()+" e de valor : +" + carta.getValor());
			System.out.println("Total de valor das cartas do jogador agora é: "+ j.contaPontos());
			if(j.contaPontos()>21) {
				System.out.println("Sinto muito você ja passou de 21!!. Você perdeu.");
				return cond=false;
			}
			
		}
		
		else if(num == 2) { 
			cond = endGameEscolha(b);
		
		}
		
		else {
			System.out.println("O jogador "+j.getNome()+" tem um total de "+j.contaPontos()+" Pontos");
		}
		
		return cond;
		
	}
	
	public boolean endGameEscolha(Baralho b) {
		System.out.println("Jogo finalizado. O jogador teve um total de "+ j.contaPontos());
		Cartas carta = b.getUltimaCarta();
		System.out.println("A proxima carta era: "
				+ "\ntipo: "+carta.getTipo()
				+ "\nvalor: "+carta.getValor());
		j.addCarta(carta);
		int i = j.contaPontos();
		if(i>21) {
			System.out.println("Parabens!! Você venceu. O valor total seria: "+ i);
		}else {
			System.out.println("Sinto muito! Mas foi quase. O valor final total foi de: "+ i);
		}
		return false;
	}
		
}
