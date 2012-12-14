package annanda.lab5;

public class Bloco implements Comando {

	public Comando[] comandos; 
	public Bloco() {
	}
	

	public Bloco(Comando ... comandos) {
		this.comandos = comandos;
	}


	@Override
	public void executa() {
		for(Comando comando : this.comandos) {
			comando.executa();
		}
	}
	

}
