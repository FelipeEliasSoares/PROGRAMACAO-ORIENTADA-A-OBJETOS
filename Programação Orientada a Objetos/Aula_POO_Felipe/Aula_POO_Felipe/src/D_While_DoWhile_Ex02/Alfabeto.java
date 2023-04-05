/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex02;


/**
 *
 * @author Aluno
 */
public class Alfabeto {
    
    private String letra,resp;
    private int a,e,i,o,u,consoante;
    
    public void contador(String letra){
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("a")){
            this.a++;
        }
        else{
            if(this.letra.equalsIgnoreCase("e")){
              this.e++;
                
            }
            else{
                if(this.letra.equalsIgnoreCase("i")){
                     this.i++;
                }
                else{
                    if(this.letra.equalsIgnoreCase("o")){
                    this.o++;
                    }
                    else{
                        if(this.letra.equalsIgnoreCase("u")){
                        this.u++;
                        }
                        else{
                            if(this.letra.equalsIgnoreCase("0")){
                                this.consoante++;
                            }
                        }
                    }
                }
            }   
        }
       }
    
    public String Monstrar_dados(){
      this.resp = "O numero de vogal A é: " + this.a
              + "\nO numerro de vogal E é: "+this.e
              + "\nO numero de vogal I é: "+this.i
              + "\nO numero de vogal O é: "+this.o
              + "\nO numero de vogal U é: "+this.u
              + "\nO numero de consoantes é: "+this.consoante;
      return this.resp;
      
    }
   
}

     