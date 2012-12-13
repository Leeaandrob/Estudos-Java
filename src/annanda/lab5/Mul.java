package annanda.lab5;

public class Mul implements Expressao {
	
	public double esquerda;
	public double direita;

	public Mul() {
	}

	public Mul(double esquerda, double direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		return this.esquerda * this.direita;
	}

}
