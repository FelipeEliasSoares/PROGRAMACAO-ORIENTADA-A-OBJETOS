/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex02;

/**
 *
 * @author Aluno
 */
public class Numeros {
   private int n1,n2;
   private String imprimir = "";
   public String intervalo(int n1, int n2){
       this.n1 = n1;
       this.n2 = n2;
       int intevalo;
       
       for(int cont=n1;cont<=n2;cont++){
           this.imprimir = this.imprimir+ " "+ cont;
       }
       
       return this.imprimir;
   }
}
