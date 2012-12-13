package annanda.lab5;

public class Atrib implements Comando {
	public Var variavel;
	public Expressao expressao;
	
	public Atrib() {
	}
	
	public Atrib(Var variavel, Expressao expressao) {
		super();
		this.variavel = variavel;
		this.expressao = expressao;
	}


	@Override
	public void executa() {
		this.variavel.valor = expressao.valor();
	}
	

}
