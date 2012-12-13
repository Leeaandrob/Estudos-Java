package annanda.lab5;

public class Div implements Expressao {
	
	public Expressao esquerda;
	public Expressao direita;

	public Div() {
	}

	public Div(Expressao esquerda, Expressao direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		return this.esquerda.valor() / this.direita.valor();
	}

}
