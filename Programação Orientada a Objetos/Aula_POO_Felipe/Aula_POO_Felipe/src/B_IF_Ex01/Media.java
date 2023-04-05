/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex01;

/**
 *
 * @author Aluno
 */
public class Media {
    private double nota1,nota2,medif;
    private String resposta;
    public String calcular(double nota1,double nota2){
        this.nota1 =nota1;
        this.nota2=nota2;
        this.medif = (this.nota1 + this.nota2)/2;
        
        if(this.medif >= 6){
            this.resposta = "Aprovados";
        }
        else{
            if((this.medif >=4 ) && (this.medif <6)){
            this.resposta = "Recuperação";
            }
            else
            {
             this.resposta = "Reprovado";        
            }
        }
        return this.resposta;
        }
    }

