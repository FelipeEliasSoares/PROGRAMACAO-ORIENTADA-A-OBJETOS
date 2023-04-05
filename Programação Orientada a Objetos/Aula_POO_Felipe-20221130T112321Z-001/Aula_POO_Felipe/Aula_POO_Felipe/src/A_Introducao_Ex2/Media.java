/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex2;

/**
 *
 * @author Aluno
 */
public class Media {
   private double nota1,nota2,nota3,peso1,peso2,peso3,media; 
   
   public double calcularMedia(double nota1, double nota2, double nota3,double peso1, double peso2, double peso3){
   this.nota1 = nota1;
   this.nota2 = nota2;
   this.nota3 = nota3;
   this.peso1 = peso1;
   this.peso2 = peso2;
   this.peso3 = peso3;
   
   this.media = ((this.nota1 * this.peso1)+ (this.nota2 * this.peso2) +(this.nota3* this.peso3) / (this.nota1 + this.nota2 + this.nota3));   
   
   return this.media;
   };
}
