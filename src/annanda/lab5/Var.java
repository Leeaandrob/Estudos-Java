package annanda.lab5;

public class Var implements Expressao {

	public double valor;
	public String nome;
	
	public Var() {
	}
	public Var(String nome) {
		this.nome = nome;
		this.valor = 0.0;
	}
	
	@Override
	public double valor() {
		return this.valor;
	}

	
}
