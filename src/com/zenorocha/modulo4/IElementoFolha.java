/*
 * Modulo 3
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 30/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa Folha de Pagamento � Pessoas e Empresas
 * 
 * 	Gere uma nova vers�o do programa anterior, considerando o seguinte design: As classes
 * 	Empregado* implementam uma interface IElementoFolha. A interface IElementoFolha
 * 	estende duas interfaces: IPagamento e INome.
 * 	A interface IPagamento possui a seguinte opera��o:getPagamentoLiquido e getRegime.
 * 		
 * 		� A opera��o getPagamentoLiquido retorna o pagamento l�quido conforme as f�rmulas
 * 		de c�lculo definidas anteriormente.
 * 		� A opera��o getTipo retorna o tipo do elemento para impress�o na folha (Horista, Assalariado, Bonificado).
 * 
 * 	A interface INome possui a opera��o getNome.
 * 	Modifique tamb�m a classe FolhaPagamento de forma que o array n�o seja mais da
 * 	superclasse Empregado, mas sim um array de IElementoFolha, ou seja, de objetos que implementem esta interface.
 * 	Uma vez que a nova vers�o do programa esteja funcionando, agora com interfaces, fa�a a seguinte extens�o:
 * 	Crie uma classe Empresa que tamb�m implementar� a interface IElementoFolha, com
 * 	nome, um valor bruto, uma taxa de IR e uma taxa de ISS como descontos.
 * 	
 * 	O valor l�quido de uma empresa � dado pela seguinte f�rmula: Valor Bruto * (1 � taxaIR � taxaISS).
 * 	A implementa��o da opera��o getRegime de empresa dever� retornar o string �Pessoa Jur�dica�.
 * 
 * 	Modifique a classe FolhaPagamento de forma a imprimir uma rela��o de pagamentos a
 * 	serem efetuados, considerando horistas, assalariados, bonificados e empresas. Para tal,
 * 	inicialize o vetor de elementos do tipo IElementoFolha definido em FolhaPagamento para
 * 	que tenha 3 elementos de cada tipo, ou seja, 3 horistas, 3 assalariados, 3 bonificados e 3 empresas.
 * 
 */

package com.zenorocha.modulo4;

public interface IElementoFolha extends INome, IPagamento {

}
