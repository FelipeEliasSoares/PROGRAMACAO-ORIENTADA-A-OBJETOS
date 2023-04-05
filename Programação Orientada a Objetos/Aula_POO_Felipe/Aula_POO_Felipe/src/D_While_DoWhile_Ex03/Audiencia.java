/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex03;

/**
 *
 * @author Aluno
 */
public class Audiencia {
    
    private int cont_9,cont_12,cont_23,cont_40,cont_outros,canal;
    
    
    public void pesquisa(int canal){
        this.canal=canal;
        if(canal==9){
            this.cont_9++;
        }
        else if(canal==12){
            this.cont_12++;
        }
        else if(canal==23){
            this.cont_23++;
        }
        else if(canal==40){
            this.cont_40++;
        }
        else if(canal !=0){
             this.cont_outros++;
        }
        else{
           
        }
    }
    
    public String imprimir(){
        String resposta;
        
        resposta="O numero de audiencia do canal 9 é: " + this.cont_9
              + "\nO numero de audiencia do canal 12 é: " + this.cont_12
              + "\nO numero de audiencia do canal 23 é: " + this.cont_23
              + "\nO numero de audiencia do canal 40 é: " + this.cont_40
              + "\nO numero de audiencia do canal de outrsos canais é: " + this.cont_outros;
        
        return resposta;
    }
}
