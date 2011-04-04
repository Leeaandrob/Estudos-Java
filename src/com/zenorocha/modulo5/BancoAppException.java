/*
 * Modulo 5
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 03/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Passo 1: Construir as classes Conta e BancoAppException
 * 	
 * 	Classe Conta:
 * 		Atributos:
 * 			� numero (string)
 * 			� saldo (double)
 * 
 * 		Opera��es:
 * 			� Construtor com os par�metros numero da conta e saldo inicial.
 * 			� Opera��o: debitar (par�metro: valor) -> acumula valor no saldo da conta.
 * 			� Opera��o: creditar (par�metro: valor) -> debita valor do saldo da conta.
 * 
 * 	Considere as seguintes regras:
 * 
 * 	a) debitar:
 * 		� valor a debitar tem que ser um n�mero positivo maior que zero.
 * 		� conta tem que ter saldo suficiente para o d�bito, isto �, a conta tem que ter
 * 		um valor maior ou igual a zero ap�s o d�bito.
 * 		� Existe um limite para o valor a debitar que � de 2.000,00. O limite � por
 * 		opera��o de d�bito (suponha que n�o exista limite di�rio).
 * 	
 * 	b) creditar:
 * 		� valor a creditar tem que ser um n�mero positivo maior que zero.
 * 
 * 	Em caso de falha nessas regras, a implementa��o da opera��o (debitar ou creditar) deve
 * 	arremessar uma exce��o do tipo BancoAppException (que deve ser criada por voc�,
 * 	estendendo a classe Exception j� existente no Java) com uma mensagem de erro
 * 	correspondente ao problema.
 * 
 * 	ATEN��O: Defina a classe Conta no pacote banco.negocio
 * 
 */

package com.zenorocha.modulo5;

public class BancoAppException extends Exception {
	
	// wtf?
	private static final long serialVersionUID = 1L;

	public BancoAppException(final String erro) {
		//System.out.println(erro);
		System.err.println(erro);
	}
}
