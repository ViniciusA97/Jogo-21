package FacadeComunicacao;

import java.io.IOException;

public class ExceptionContagem extends IOException {
	
	private static final long serialVersionUID = 1L;
	public ExceptionContagem(String erro) {
		super(erro);
	}
	public ExceptionContagem() {
		super("Erro: Numero digitado invalido");
	}
}
