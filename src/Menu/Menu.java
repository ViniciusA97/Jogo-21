package Menu;

import Baralho.*;
import FacadeComunicacao.*;
import Jogador.*;

public class Menu {

	public static void main(String[] args) {
		
		System.out.println("-------- Bem vindo a 21---------\n");
		System.out.println("Jogo construidpor: Vinicius Andrade de Queiroz");
		System.out.println("\nO jogo irá começar!\n");
		
		FachadaComunicacao fachadaC= FachadaComunicacao.getInstance();
		FachadaFuncoes fachadaF = FachadaFuncoes.getInstance();
		
		boolean condGeral=true;
		
		while(condGeral) {
		
			String nome = fachadaC.inputString("Nome do Jogador: ");
			Jogador j = Jogador.getInstance();
			j.setNome(nome);
		
			Baralho baralho = null;
		
			boolean cond = true;
		
			while(cond) {
			
				try {
					int tipoBaralho = fachadaC.inputInt("Digite o tipo do baralho: [1- Polones] [2- Portugues]");
					baralho = fachadaF.CriaBaralho(tipoBaralho);
					cond = false;
				} catch (ExceptionContagem e) {
					System.out.println(e.getMessage());
				}
		
			}
			cond = true;
			while(cond) {
			
				try {
					cond= fachadaF.setJogada(baralho);
				} catch (ExceptionContagem e) {
					System.out.println(e.getMessage());
				}
	
			}	
		
		
			int condtion = fachadaC.inputInt("Jogo finalizado. Deseja novamente? [1]- sim [2]- nao");
			if(condtion==2) {
				condGeral=false;
			}
			j.zeraCarta();
		}
		System.out.println("Jogo Finalizado");
	}
}