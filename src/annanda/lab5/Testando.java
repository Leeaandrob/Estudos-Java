package annanda.lab5;

public class Testando {

	public Testando() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Var x = new Var("x");
		Var fat = new Var("fat");
		
		x.valor = new LeNumero().valor();
		System.out.println("x:"+x.valor);

		
	}

}
