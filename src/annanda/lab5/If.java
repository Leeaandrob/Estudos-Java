package annanda.lab5;

public class If implements Comando {
	public Expressao expIf;
	public Comando cmdElse;
	public Comando cmdThen;
	
	public If() {
	}
	

	public If(Expressao expIf, Comando cmdElse, Comando cmdThen) {
		this.expIf = expIf;
		this.cmdElse = cmdElse;
		this.cmdThen = cmdThen;
	}


	@Override
	public void executa() {
		//teste
		if(this.expIf.valor() == 0){
			//cmdThen
			this.cmdThen.executa();
		}
		else{
			//cmdElse
			this.cmdElse.executa();
		}
		
	}
	

}
