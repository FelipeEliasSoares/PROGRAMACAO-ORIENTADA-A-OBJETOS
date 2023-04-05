/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class MediaVIEW {
    public static void main(String[] args) {
        MediaDTO mediaDTO = new MediaDTO();
        MediaCTR mediaCTR = new MediaCTR();
        
        try {
            mediaDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1: ")));
            mediaDTO.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2: ")));
            
            JOptionPane.showMessageDialog(null, mediaCTR.Imprimir(mediaDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro sistema " + e.getMessage());
        }
    }
}
