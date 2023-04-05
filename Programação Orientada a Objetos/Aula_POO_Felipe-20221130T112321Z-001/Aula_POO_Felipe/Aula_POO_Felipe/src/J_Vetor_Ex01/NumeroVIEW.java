/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Vetor_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NumeroVIEW {
    public static void main(String[] args) {
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        
        int num[]= new int[5];
        
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero para a posição " + i));
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.verificarPosicao(numeroDTO));
    }
}
