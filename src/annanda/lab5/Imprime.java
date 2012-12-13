package annanda.lab5;

public class Imprime implements Comando {

	public Imprime() {
	}

	public Imprime(Expressao expressao) {
		System.out.println(expressao.valor());
	}
	

}
