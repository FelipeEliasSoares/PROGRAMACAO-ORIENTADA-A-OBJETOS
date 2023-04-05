/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex05;

import A_Introducao_Ex2.Media;

/**
 *
 * @author Aluno
 */
public class ClassificacaoCTR {
    ClassficacaoDAO classificacaoDAO = new ClassficacaoDAO();
    
    public String Resultado_Classificacao(ClassificacaoDTO classificacaoDTO){
        return  classificacaoDAO.Resultado(classificacaoDTO);
                
    }
}
