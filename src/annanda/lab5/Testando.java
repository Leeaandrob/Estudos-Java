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
	    Comando prog = 
	      new Bloco(new Comando[] {
	                  new Atrib(x, new LeNumero()),
	                  new If(new Menor(new Num(0), x),
	                         new Bloco(new Comando[] { new Atrib(fat, new Num(1)),
	                                                   new While(new Menor(new Num(0), x),
	                                                             new Bloco(new Comando[] { new Atrib(fat, new Mul(fat, x)),     
	                                                                                       new Atrib(x, new Sub(x, new Num(1))) })),
	                                                   new Imprime(fat) }),
	                         new Bloco(new Comando[] { })) });
	    prog.executa();
		
	}

}
