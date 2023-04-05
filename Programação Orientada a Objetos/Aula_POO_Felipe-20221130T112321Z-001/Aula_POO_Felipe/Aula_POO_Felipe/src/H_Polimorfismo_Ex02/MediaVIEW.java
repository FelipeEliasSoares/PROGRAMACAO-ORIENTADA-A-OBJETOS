/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class MediaVIEW {
    public static void main(String[] args) {
        MediaCTR mediaCTR = new MediaCTR();
        MediaDTO mediaDTO = new MediaDTO();
        
        mediaDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 1")));
        mediaDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 2")));
        mediaDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 3")));
        mediaDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite nota 4")));
        
        mediaDTO.setOpc(Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para media com duas notas\nDigite 2 para media com três notas\nDigite 3 para media com quatro notas\nInforme: ")));
        
        mediaCTR.calcular(mediaDTO);
        JOptionPane.showMessageDialog(null, mediaCTR.monstrarMedia(mediaDTO));
    }
}
