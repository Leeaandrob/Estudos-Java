package annanda.lab5;

public class Div implements Expressao {
	
	public double esquerda;
	public double direita;

	public Div() {
	}

	public Div(double esquerda, double direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		return this.esquerda / this.direita;
	}

}
