/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex06;

/**
 *
 * @author Aluno
 */
public class Maior_menor {
    private int numero,cont;
    private int maior,menor;
    public void veficacao(int numero,int cont){
        this.numero= numero;
        this.cont=cont;
        int maior,menor;
        
        maior = 0;
        menor = 99999;
        if(this.cont ==1){
            this.maior= this.numero;
            this.menor=this.numero;
        }
        else{
            if(this.numero >= this.maior){
                this.maior=this.numero;
            }
            if(this.numero <= this.menor){
                this.menor= this.numero;
            }
        }
    }
    
    public String Resultado(){
        return " O maior numero foi " + this.maior + " e menor foi " + this.menor;
        
    }


}
