/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex04;

/**
 *
 * @author Aluno
 */
public class Altura {
    private float alturas,media,soma;
    private int quantidade,maior;
    
    
    public void soma(float altura){
        this.alturas = altura;
        this.soma += this.alturas;
        
        if(this.alturas>2.00){
            this.quantidade++;
        }
        

    }
    
    public float media(){
        this.media = this.soma/20;
        
        return this.media;
    }
    
    public float quantidade(){
        return this.quantidade;
    }
}
