/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex03;

/**
 *
 * @author Aluno
 */
public class LerNumeros {
    private int soma,numero;
    
    public void soma(int numero){
           this.numero = numero;
           this.soma += this.numero;

    }
    
    public int monstrar_soma(){
        return this.soma;
    
    }
}
