/*
 * Modulo 3
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 21/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa Comprimento_01:
 * 
 * 	Defina uma classe Comprimento com a qual possamos:
 * 
 * 		a) Criar um objeto Comprimento passando tr�s valores (correspondentes a metros, cent�metros e mil�metros).
 * 		b) Criar um objeto Comprimento passando um valor em mil�metros.
 * 		c) Criar um objeto Comprimento passando um valor em cent�metros e um valor em mil�metros.
 * 		d) Obter uma string com o comprimento em metros, cent�metros e mil�metros. (Formato do string gerado: �x metros, y cent�metros e z mil�metros�).
 * 		e) Obter o valor total do comprimento em mil�metros (retorna um valor inteiro).
 * 		f) Obter o valor total do comprimento em metros (retorna um valor ponto flutuante).
 * 		g) Somar dois comprimentos gerando um novo objeto comprimento que � a soma dos dois => chamada ser� Comprimento.somar(a,b)
 * 		h) Subtrair dois comprimentos, gerando um novo objeto comprimento que � a subtra��o de a por b => chamada ser� Comprimento.subtrair(a,b)
 * 		i) Multiplicar o comprimento por um valor inteiro (resultado ser� o objeto comprimento atualizado) => chamada ser� x.multiplicar(i);
 * 		j) Dividir o comprimento por um valor inteiro => idem � multiplica��o.
 * 
 * 	Armazene as informa��es de um comprimento em tr�s atributos inteiros distintos
 * 	(metros, cent�metros, mil�metros).
 * 
 * 	Crie um programa para usar a classe Comprimento. Por exemplo, defina uma classe
 * 	TesteComprimento que vai ter uma opera��o main e algumas opera��es de teste. A
 * 	opera��o main apenas chamar� as opera��es de teste em seq��ncia.
 * 
 * 	Exemplos:
 * 		
 * 		a) testeConstrutorMCM:
 * 			criar um objeto com 5 metros, 10 cent�metros e 2 mil�metros e imprimir seu valor
 * 			string atrav�s de uma chamada � opera��o obter string (item d da classe Comprimento).
 * 			Voc� pode experimentar criar outros objetos Comprimento com outros valores para
 * 			metros, cent�metros e mil�metros para se certificar que o programa est� funcionando em outras situa��es.
 * 
 * 		b) testeContrutorM:
 * 			criar um objeto com 5102 mil�metros e imprimir seu valor string atrav�s de uma
 * 			chamada � opera��o obter string (item d da classe Comprimento).
 * 			Voc� pode experimentar criar outros objetos Comprimento com outros valores para
 * 			mil�metros para se certificar que o programa est� funcionando em outras situa��es.
 * 
 * 		c) testeConstrutorCM:
 * 		d) testeValorMilimetros:
 * 		e) testeValorMetros:
 * 		f) testeSoma
 * 		g) testeSubtracao
 * 		h) testeMultiplicacao
 * 		i) testeDivisao
 * 
 */

package com.zenorocha.modulo6;

public class Comprimento_01 {

	private int m; // metros
	private int cm; // cent�metros
	private int mm; // mil�metros
	
	// default
	public Comprimento_01() {
		
	}
	
	// a)
	public Comprimento_01(int m, int cm, int mm) {
		this.m = m;
		this.cm = cm;
		this.mm = mm;
	}

	// b)
	public Comprimento_01(int mm) {
		this.mm = mm;
	}
	
	// c)
	public Comprimento_01(int cm, int mm) {
		this.cm = cm;
		this.mm = mm;
	}
	
	// d)
	public void Print() {
		System.out.println(this.m + " metros, " + this.cm + " cent�metros e " + this.mm + " mil�metros");
	}
	
	// g)
	public Comprimento_01 Somar(Comprimento_01 x, Comprimento_01 y) {
		
		Comprimento_01 z = new Comprimento_01();
		
		z.cm = x.cm + y.cm;
		z.m = x.m + y.m;
		z.mm = x.mm + y.mm;
		
		return z;
	}
	
	// h)
	public Comprimento_01 Subtrair(Comprimento_01 x, Comprimento_01 y) {
		
		Comprimento_01 z = new Comprimento_01();
		
		z.cm = x.cm - y.cm;
		z.m = x.m - y.m;
		z.mm = x.mm - y.mm;
		
		return z;
	}
	
	// i)
	public void Multiplicar(int valor) {
		
		this.cm = this.cm * valor;
		this.m = this.m * valor;
		this.mm = this.mm * valor;
	}
	
	// j)
	public void Dividir(int valor) {
		
		this.cm = this.cm / valor;
		this.m = this.m / valor;
		this.mm = this.mm / valor;
	}

	// getters and setters
	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getCm() {
		return cm;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}
	
	// e)
	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}
	
	// f)
	public float getFloatM() {
		return (float)m;
	}
}
