/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex06;

/**
 *
 * @author Aluno
 */
public class TrianguloDAO {
    private boolean Triangulo;
    private String classeficao;
    public Boolean Vefic_Triangulo(TrianguloDTO trianguloDTO){
        if(((trianguloDTO.getLado1()+trianguloDTO.getLado3())> trianguloDTO.getLado2())){
            Triangulo=true;
        }
        else if(((trianguloDTO.getLado2()+trianguloDTO.getLado3())>trianguloDTO.getLado1())){
            Triangulo=true;
        }
        else if(((trianguloDTO.getLado1()+trianguloDTO.getLado2())>trianguloDTO.getLado3())){
            Triangulo=true;
        }
        else{
            Triangulo=false;
        }
        
        return Triangulo;
    }
    
    
    public String Classifica_Triangulo(TrianguloDTO trianguloDTO){
        if(Vefic_Triangulo(trianguloDTO)){
            if((trianguloDTO.getLado1()==trianguloDTO.getLado2()) && 
                (trianguloDTO.getLado1()==trianguloDTO.getLado3())){
                this.classeficao="Triangulo Equilatero";
            }
            /*else{
                if((trianguloDTO.getLado1()==trianguloDTO.getLado2())||(trianguloDTO.getLado2()==trianguloDTO.getLado3()) || (trianguloDTO.getLado1()==trianguloDTO.getLado3())){
                    this.classeficao="Triangulo Isosceles";
                }
                else{
                    this.classeficao="Triangulo Escaleno";
                }
            */
        }
        else{
            this.classeficao= "Não é um triangulo";
        }
        
        return this.classeficao;
    }
}
