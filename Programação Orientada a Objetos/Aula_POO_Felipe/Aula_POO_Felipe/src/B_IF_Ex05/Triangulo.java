/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex05;

/**
 *
 * @author Aluno
 */
public class Triangulo {
    private int x,y,z;
    private String resposta;
    public String determinante(int x,int y,int z){
        this.x =x;
        this.y=y;
        this.z=z;
        
        if((x < y + z) && (y < x + z) && (z < x + y)){
            if(x == y && x == z){
                this.resposta = "È um triangulo equilatero";
            }
            else if((x == y) || (x == z)){
                this.resposta = "È um trianguo isosceles";
            }
            else{
                this.resposta = "É um triangulo escaleno";
            }
        }else{
            this.resposta ="Não é um triangulo";
        }
        
        return this.resposta;
    }
}
