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
 * Passo 2: Construir a classe BancoUI (interface com o usu�rio)
 * 
 * 	Fa�a uma classe BancoUI que corresponder� a uma interface com usu�rio rudimentar via 
 * 	console que dever� se comportar da seguinte forma:
 * 
 * 	A classe BancoUI dever� instanciar o objeto Conta que ser� manipulado durante a
 * 	execu��o do programa. Antes de instanciar o objeto Conta, por�m, BancoUI dever�
 * 	perguntar para o usu�rio o n�mero e o saldo inicial que ser�o passados para o construtor do
 * 	objeto Conta.
 * 
 * 	A opera��o do programa ser� baseada em um menu textual em console (n�o se preocupem
 * 	com coisas do tipo limpar a tela, e etc), com as seguintes op��es:
 * 
 * 		1 � creditar na conta
 * 		2 � debitar da conta
 * 		3 � consultar saldo
 * 		4 � finalizar o programa
 * 
 * 	Se o usu�rio entrar a op��o 1, o programa dever� perguntar o valor a ser creditado. O
 * 	usu�rio entrar� o valor e a classe BancoUI chamar� diretamente a opera��o creditar com o
 * 	valor passado. Caso haja uma exce��o, o programa dever� exibir a mensagem de erro
 * 	correspondente. Caso contr�rio o programa dever� apresentar a mensagem �Opera��o bem sucedida�.
 * 	
 * 	Se o usu�rio entrar a op��o 2, o programa dever� perguntar o valor a ser creditado. O
 * 	usu�rio entrar� o valor e a classe BancoUI chamar� diretamente a opera��o creditar com o
 * 	valor passado. Caso haja uma exce��o, o programa dever� exibir a mensagem de erro
 * 	correspondente. Caso contr�rio, o programa dever� apresentar a mensagem �Opera��o bem sucedida�.
 * 	
 * 	Se o usu�rio entrar a op��o 3, o programa dever� apresentar o valor atual do saldo da conta.
 * 
 * 	Ap�s executar qualquer destas tr�s op��es, o programa dever� apresentar novamente o menu de op��es.
 * 	
 * 	ATEN��O: Defina a classe BancoUI no pacote banco.ui.
 * 
 */

package com.zenorocha.modulo5.banco.ui;

import java.util.Scanner;

import com.zenorocha.modulo5.BancoAppException;
import com.zenorocha.modulo5.banco.negocio.Conta;

public class BancoUI {
	
	public BancoUI() {
		
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o numero da sua conta: ");
		String numero = scanner.next();
		
		System.out.println("Informe o saldo inicial da sua conta: ");
		double saldo = scanner.nextDouble();
		
		Conta conta = new Conta(numero, saldo);
		
		int opcao = 1;
		
		while (opcao == 1) {
			System.out.println("1 - Creditar na conta");
			System.out.println("2 - Debitar na conta");
			System.out.println("3 - Consultar saldo");
			System.out.println("4 - Finalizar o programa");
			
			int escolha = scanner.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.println("Entre com o valor a ser creditado: ");
				
				try {
					conta.creditar(scanner.nextDouble());
					System.out.println("\nOperacao bem sucedida.\n");
				}
				catch (BancoAppException e) {
					break;
				}
				
				break;
			case 2:
				System.out.println("Entre com o valor a ser debitado: ");
				
				try {
					conta.debitar(scanner.nextDouble());
					System.out.println("Operacao bem sucedida.");
				}
				catch (BancoAppException e) {
					break;
				}
				
				break;
			case 3:
				System.out.println("Seu saldo atual e de: " + conta.getSaldo());
				break;
			case 4:
				opcao = 0;
				break;

			default:
				System.out.println("Entre com uma opcao valida entre 1 e 4.");
				break;
			}
		}
	}
	
}
