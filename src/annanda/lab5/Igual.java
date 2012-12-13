package annanda.lab5;

public class Igual implements Expressao {
	
	public double esquerda;
	public double direita;

	public Igual() {
	}

	public Igual(double esquerda, double direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		if(this.esquerda == this.direita)
			return 1;
		else 
			return 0;
	}

}
