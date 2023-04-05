/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex4;

/*Um funcionario rece um salario fixo mais 4% de comissão sobre as vendas.
Faça um programa que receba o salario fixo de um funcionario e o valor de suas vendas,
calcule e mostre a comissão e o salario final do funcionario.
*/


/**
 *
 * @author Aluno
 */
public class Calcular {
    private float salarioB,vendas,salariofinal,comissao,quantidade;
    
    public float calcularSalario(float salarioB,float vendas,float quantidade){
        this.salarioB = salarioB;
        this.vendas = vendas;
        this.quantidade = quantidade;
        
       this.comissao = (this.quantidade * 4/100) + 1;
       this.salariofinal = this.salarioB + this.comissao;
     
       return salariofinal;
    }
}
