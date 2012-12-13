package annanda.lab5;

public class Num implements Expressao {
	public double numeral;
	
	public Num() {
	}

	public Num(double numeral){
		this.numeral = numeral;
	}

	@Override
	public double valor() {
		return this.numeral;
	}
	
	
	
}
