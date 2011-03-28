/*
 * M�dulo 2
 * Projeto e Constru��o de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 18/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa 3.2
 * 
 *	Escreva um programa que determine se um n�mero � ou n�o um pal�ndromo (as leituras da
 *	esquerda para a direita e vice-versa s�o iguais).
 *	Exemplos de Pal�ndromo: 12321, 55555, 45554, 11611, 123321
 * 
 */

package com.zenorocha.modulo2;

import java.util.Scanner;

public class TresPontoDois {

	private String entrada;
	
	public TresPontoDois() {
		
	}
	
	public String getEntrada() {
		return entrada;
	}
	
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	
	public void verificaPalindromo() {
		int i = 0;
		
		while (i < this.entrada.length()) {
			if (this.entrada.charAt(i) != this.entrada.charAt(this.entrada.length() - i - 1)) {
				System.out.println("N�o � Pal�ndromo");
				System.exit(0);
			}
			
			i++;
		}
		
		System.out.println("� um Pal�ndromo");
	}
	
	public static void main(String[] args) {
		TresPontoDois objTresPontoDois = new TresPontoDois();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um valor qualquer");
		
		objTresPontoDois.setEntrada(scanner.next());
		
		objTresPontoDois.verificaPalindromo();  
	}
}