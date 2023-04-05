/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex3;

/**
 *
 * @author Aluno
 */
public class Salario {
    private float salario,porcetagem,salarioF;
    
    public float calcularSalario(float salario,float porcetagem){
       this.salario = salario;
       this.porcetagem = porcetagem;
       
       this.salarioF = this.salario +(this.salario *this.porcetagem/100);
       return this.salarioF;
    }
}
