package annanda.lab5;

public class Soma implements Expressao {
	
	public double esquerda;
	public double direita;

	public Soma() {
	}

	public Soma(double esquerda, double direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		return this.esquerda + this.direita;
	}

}
