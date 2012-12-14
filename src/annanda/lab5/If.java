package annanda.lab5;

public class If implements Comando {
	public Expressao expIf;
	public Comando cmdElse;
	public Comando cmdThen;
	
	public If() {
	}
	

	public If(Expressao expIf, Comando cmdThen, Comando cmdElse) {
		this.expIf = expIf;
		this.cmdThen = cmdThen;
		this.cmdElse = cmdElse;
	}


	@Override
	public void executa() {

		//teste
		if(this.expIf.valor() == 1){

			//cmdThen
			this.cmdThen.executa();
		}
		else{
			//cmdElse
			this.cmdElse.executa();
		}
		
	}
	

}
