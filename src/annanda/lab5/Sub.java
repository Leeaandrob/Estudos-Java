package annanda.lab5;

public class Sub implements Expressao {
	
	public double esquerda;
	public double direita;

	public Sub() {
	}

	public Sub(double esquerda, double direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		return this.esquerda - this.direita;
	}

}
