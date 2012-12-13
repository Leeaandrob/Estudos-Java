package annanda.lab5;

public class While implements Comando {
	public Expressao expIf;
	public Comando comando;
	
	public While() {
	}
	

	public While(Expressao expIf, Comando comando) {
		this.expIf = expIf;
		this.comando = comando;
	}


	@Override
	public void executa() {
		//condicao
		while(this.expIf.valor() ==1){
			this.comando.executa();
		}
		
	}
	

}
