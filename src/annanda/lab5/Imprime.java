package annanda.lab5;

public class Imprime implements Comando {
	
	public Expressao expressao;
	public Imprime() {
	}

	public Imprime(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public void executa() {
		System.out.println(expressao.valor());
	}
	

}
