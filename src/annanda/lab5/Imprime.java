package annanda.lab5;

public class Imprime implements Comando {

	public Imprime() {
	}

	public Imprime(Var variavel) {
		System.out.println(variavel.valor());
	}
	

}
