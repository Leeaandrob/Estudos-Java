/*
 * Modulo 4
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 03/04/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa Folha de Pagamento � Pessoas e Empresas
 * 
 * 	Este � um exerc�cio de reestrutura��o de um fragmento de uma aplica��o, que embora
 * 	tenha sido feita em Java, est� longe de ser aderente ao paradigma de orienta��o a objetos.
 * 	Note por exemplo que os atributos foram definidos com o modificador public e a
 * 	implementa��o horr�vel da opera��o getOcupacao da classe LinhaFerroviaria, com v�rias
 * 	express�es de downcasting. Sua tarefa � reestruturar a implementa��o destas classes de
 * 	forma a torn�-la orientada a objetos, a partir da utiliza��o efetiva de recursos como information hiding e polimorfismo.
 * 
 * 	Apenas para explicar o significado das classes, uma Linha Ferrovi�ria em uma esta��o de
 * 	manobra pode ter diversos recursos nela estacionados. Os recursos podem ser locomotivas
 * 	ou vag�es isolados ou um trem (formado por locomotivas e vag�es). O espa�o ocupado por
 * 	cada recurso depende do tipo do recurso. No caso de uma locomotiva, o espa�o � dado pelo
 * 	seu comprimento. No caso de um vag�o, o espa�o � dado pela soma do comprimento dos
 * 	engates mais o comprimento entre testeiras (este �ltimo corresponde ao local onde a carga
 * 	efetivamente � acondicionada). Finalmente, no caso de um trem, o comprimento � dado
 * 	pela soma do comprimento dos recursos que o comp�em (vag�es e locomotivas, calculados conforme descrito acima).
 * 
 * 	Neste exerc�cio, voc� nem precisa se preocupar muito com o significado da aplica��o. 
 * 	A id�ia � que voc� aprenda a reconhecer padr�es de estrutura��o ruim de uma aplica��o
 * 	orientada a objetos (conhecidos tamb�m como anti-padr�es) e sugerir uma solu��o mais adequada.
 * 
 */

package com.zenorocha.modulo4;

public abstract class Recurso {

}
