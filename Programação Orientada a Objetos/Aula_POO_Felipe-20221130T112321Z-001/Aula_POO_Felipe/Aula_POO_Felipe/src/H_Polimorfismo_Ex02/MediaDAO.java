/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;

/**
 *
 * @author Aluno
 */
public class MediaDAO {
    
    private double media;
    public void calcularMedia(MediaDTO mediaDTO){
        if(mediaDTO.opc==1){
            calcularMedia(mediaDTO.getN1(), mediaDTO.getN2());
        }
        else if(mediaDTO.opc==2){
            calcularMedia(mediaDTO.getN1(), mediaDTO.getN2(), mediaDTO.getN3());
        }
        else if(mediaDTO.opc==3){
            calcularMedia(mediaDTO.getN1(),mediaDTO.getN2(), mediaDTO.getN3(), mediaDTO.getN4());
        }
    }
    
    private void calcularMedia(double n1,double n2){

        
        media=(n1 + n2)/2;
    }
    
    private void calcularMedia(double n1, double n2, double n3){

        
        media= (n1 + n2 + n3)/3;
    }
    
    private void calcularMedia(double n1, double n2, double n3, double n4){

        
        media=(n1 + n2 + n3 + n4)/4;
    }
    
    
    public String Imprimir(){
        return "Sua media é " + media;
    }
}
