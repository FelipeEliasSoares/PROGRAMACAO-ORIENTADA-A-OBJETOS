/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex03;

/**
 *
 * @author Aluno
 */
public class MotoristaDAO {
    public String imprimir(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade()<= 18){
            return "Voce não pode ter CNH";
        }
        else{
            return "Voce pode ter CNH";
        }
    }
}
