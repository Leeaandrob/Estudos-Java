package annanda.lab5;

public class Mul implements Expressao {
	
	public Expressao esquerda;
	public Expressao direita;

	public Mul() {
	}

	public Mul(Expressao esquerda, Expressao direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		return this.esquerda.valor() * this.direita.valor();
	}

}
