/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex05;

/**
 *
 * @author Aluno
 */
public class AumentoSalario {
    private double salarioAtual;
    private int ano;
    public double Salario(int ano){
        this.ano = ano;
        
        this.salarioAtual = 1000;
        
        double aumento,salarioF;
        int anoInicial;
        
        aumento = 1.5;
        salarioF= this.salarioAtual + (this.salarioAtual * (aumento/100));
      
        for(anoInicial=1997;anoInicial<=ano;anoInicial++){
               aumento= aumento * 2;
               salarioF= this.salarioAtual + (this.salarioAtual * (aumento/100));
               return salarioF;
        }
        
        return salarioF;
    }
    
  
}
