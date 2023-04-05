/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex02;

/**
 *
 * @author Aluno
 */
public class Classificao {
    private int ponto;
    private String classificao;
    public String calculo(int ponto){
        this.ponto = ponto;
        this.classificao = classificao;
        
        if(this.ponto<=10){
            this.classificao = "Rochosa";
        }
        else{
            if((this.ponto>10) && (this.ponto<=40)){
                this.classificao = "Firme";
            }
            else{
                if((this.ponto>40)&& (this.ponto<=80)){
                    this.classificao = "Pantanosa";
                } 
                else{
                    if(this.ponto>80){
                        this.classificao ="Quantidade de agua invalida";
                    }
                }
            }
        }
        return this.classificao;
    }
    
}
