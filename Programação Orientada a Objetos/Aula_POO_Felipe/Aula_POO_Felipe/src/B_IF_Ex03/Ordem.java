/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex03;

/**
 *
 * @author Aluno
 */
public class Ordem {
    private int n1,n2,n3,n4;
    private String resposta;
    public String calculo(int n1,int n2 ,int n3,int n4){
        this.n1= n1;
        this.n2= n2;
        this.n3= n3;
        this.n4= n4;
        
       if(this.n4>=this.n3){
           this.resposta = "Os numero são : "+ this.n3 +this.n4 + this.n2+ this.n1;
       }
       else if((this.n4>=this.n2)&& (this.n4< this.n3)){
           this.resposta = "Os numero são : " + this.n3 +this.n4 + this.n2+ this.n1;

       }
       else if ((this.n4>this.n3)&& (this.n4< this.n2)){
           this.resposta = "Os numero são : " + this.n3 +this.n2+ this.n4+ this.n1;

       }
       else{
           this.resposta = "Os numero sã: " + this.n3 + this.n2 + this.n1 + this.n4;
       }
      
       return this.resposta;
      
    }
}
