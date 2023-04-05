/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex05;

/**
 *
 * @author Aluno
 */
public class ClassficacaoDAO {
    public String Resultado(ClassificacaoDTO classificacaoDTO){
        if(classificacaoDTO.getSolo() <=10){
            return "Rochoso";
        }
        else if((classificacaoDTO.getSolo()>10) && (classificacaoDTO.getSolo()<=40)){
            return "Firme";
        }
        else if((classificacaoDTO.getSolo()>40) && (classificacaoDTO.getSolo()<=80)){
            return "Pantanosa";
        }
        else{
            return "Quantidad de agua inválda";
        }
    }
} 
