package annanda.lab5;

public class Menor implements Expressao {
	
	public Expressao esquerda;
	public Expressao direita;

	public Menor() {
	}

	public Menor(Expressao esquerda, Expressao direita) {
		super();
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double valor() {
		if(this.esquerda.valor() < this.direita.valor())
			return 1;
		else 
			return 0;
	}

}
