/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

/**
 *
 * @author Aluno
 */
public class MediaDAO {
    private double media;
    public String resultado(MediaDTO mediaDTO){
        media = ((mediaDTO.getNota1() + mediaDTO.getNota2())/2   );
        
        if(media >= 7){
            return "Aprovado\n Sua media foi " + media;
        }
        else if((media < 7)&&(media>=4)){
            return "Recuperação\n Sua media foi " + media;
        }
        else{
            return "Reprovado \nSua media foi " + media;
        }
    
        
    }
}
