/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex06;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Aluno
 */
public class TrianguloVIEW {
    public static void main(String[] args) {
        TrianguloDTO trianguloDTO = new TrianguloDTO();
        TrianguloCTR trianguloCTR = new TrianguloCTR();
        
        try {
            trianguloDTO.setLado1(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1: ")));
            trianguloDTO.setLado2(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2: ")));
            trianguloDTO.setLado3(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3: ")));
            
            JOptionPane.showMessageDialog(null, trianguloCTR.Resultado(trianguloDTO));
        } catch (Exception e) {
        }
    }
}
