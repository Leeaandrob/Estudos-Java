/*
 * Modulo 4
 * Projeto e Construcao de Sistemas
 * Professor: Alexandre Correa
 * 
 * Implementado por Zeno Rocha
 * Em 30/03/2011
 * 
 * --------------------------------------------------------------------------------------------
 * 
 * Programa Folha de Pagamento � Pessoa F�sica
 * 
 * 	Define uma hierarquia de classes de regime de empregado (EmpregoEmpregadoHorista,
 * 	EmpregadoAssalariado e EmpregadoBonificado), onde:
 * 		
 * 		a) Todo empregado Horista tem nome, valor hora e numero de horas trabalhadas e uma taxa
 * 		fixa de 100 reais que � subtra�da do seu valor bruto.
 * 		b) Todo empregado Assalariado tem nome, sal�rio base e um desconto percentual aplicado ao seu sal�rio base.
 * 		c) Todo empregado Bonificado tem nome, sal�rio base, um desconto percentual aplicado ao
 * 		seu sal�rio base e um b�nus percentual acrescido ao valor l�quido.
 * 
 * 	Todo empregado tem um valor l�quido a receber que � dado pelas seguintes f�rmulas:
 * 
 * 		� Horista: (valor hora * numero de horas trabalhadas) � 100
 * 		� Assalariado: sal�rio base * (1 � desconto)
 * 		� Bonificado: (sal�rio base * (1 � desconto)) * (1 + b�nus)
 * 
 * 	Desta forma, desconto e b�nus s�o valores reais entre 0 e 1, e.g., 10% = 0.1.
 * 	Defina a taxa fixa de desconto do Horista como uma constante.
 * 	Para cada classe, defina um construtor que receba como par�metros todas as informa��es que ela possua.
 * 	Uma vez que as classes tenham sido criadas e que as f�rmulas de c�lculo estejam
 * 	funcionando, implemente uma classe FolhaPagamento da seguinte forma:
 * 
 * 		� Defina um �nico array de empregados com 9 empregados, sendo 3 de cada tipo (Horista, Assalariado, Bonificado).
 * 		� Crie uma opera��o que imprima no console a folha de pagamento. De cada empregado 
 * 		imprima o nome, regime (Horista, Assalariado, Bonificado) e o respectivo pagamento l�quido a receber.
 * 
 */

package com.zenorocha.modulo4;

public class EmpregadoBonificado implements IElementoFolha {
    private String nome;
    private float salarioBase;
    private float descontoPercent;
    private float bonusPercent;
    private String regime;

    public EmpregadoBonificado(String nome, float salarioBase, float descontoPercent, float bonusPercent) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.descontoPercent = descontoPercent;
        this.bonusPercent = bonusPercent;
        this.regime = "Bonificado";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getDescontoPercent() {
        return descontoPercent;
    }

    public void setDescontoPercent(float descontoPercent) {
        this.descontoPercent = descontoPercent;
    }

    public float getPagamentoLiquido() {
        float salario = (this.salarioBase * (1 - this.descontoPercent)) * (1 + this.bonusPercent);
        return salario;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    /*public static void main(String[] args) {
        System.out.println("teste");

        EmpregadoBonificado emp = new EmpregadoBonificado("Joao Roberto", 1000, 0.3f, 0.1f);
        emp.aReceberLiquido();

    }*/
}
