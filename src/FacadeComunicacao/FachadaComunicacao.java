package FacadeComunicacao;

import java.util.Scanner;

public class FachadaComunicacao {

	private static FachadaComunicacao instance;
	private Scanner in;
	
	private FachadaComunicacao() {
		in= new Scanner(System.in);
	}
	
	public static FachadaComunicacao getInstance(){
		if(instance==null) instance= new FachadaComunicacao();
		return instance;
	}
	
	public String inputString(String texto) {
		System.out.println(texto);
		return in.nextLine();
	}
	
	public int inputInt(String texto) {
		System.out.println(texto);
		return Integer.parseInt(in.nextLine());
	}
	
}