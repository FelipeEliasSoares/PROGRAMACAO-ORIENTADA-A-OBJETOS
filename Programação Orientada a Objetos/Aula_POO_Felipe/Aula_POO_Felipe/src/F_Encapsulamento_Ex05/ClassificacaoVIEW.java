/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex05;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClassificacaoVIEW {
    public static void main(String[] args) {
        ClassificacaoDTO classificacaoDTO = new ClassificacaoDTO();
        ClassificacaoCTR classificacaoCTR = new ClassificacaoCTR();
        
        try {
            classificacaoDTO.setSolo(Integer.parseInt(JOptionPane.showInputDialog("Digite a pontuação")));
            
            JOptionPane.showMessageDialog(null, classificacaoCTR.Resultado_Classificacao(classificacaoDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro sistema" + e.getMessage());
        }
        
    }
}
