/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex04;

/**
 *
 * @author Aluno
 */
public class Classificacao {
    private double peso, altura;
    private String classificao;
    public String tabela(double altura,double peso){
        this.peso = peso;
        this.altura = altura;
        
        if(this.altura<1.20){
            if(this.peso<60){
                this.classificao = "Classificação : A";
            }
            else if((this.peso>60) && (this.peso<=90)){
                this.classificao = "Classificação : D";
            }
            else if(this.peso>90){
                this.classificao = "Classificação : G";
            }
        
        }
        else if((this.altura>=1.20) && (this.altura<1.70)){
            if(this.peso<60){
                this.classificao = "Classificação : B";
            }
            else if((this.peso>=60) && (this.peso<=90)){
                this.classificao = "Classificação : E";
            }
            else if(this.peso>90){
                this.classificao = "Classificação : H";
            }
        } 
        else if(this.altura>1.70){
            if(this.peso<60){
                this.classificao = "Classificação : C";
            }
            else if((this.peso>=60) && (this.peso<=90)){
                this.classificao = "Classificação : F";
            }
            else if(this.peso>90){
                this.classificao = "Classificação : I";
            }
        }
        
        return this.classificao;
    }//fecha
    
}
