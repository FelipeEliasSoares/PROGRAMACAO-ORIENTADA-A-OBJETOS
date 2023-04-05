/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Vetor_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NumerosInversosVIEW {
    public static void main(String[] args) {
        NumeroInversosDTO numeroInversosDTO = new NumeroInversosDTO();
        NumeroInversosCTR numeroInversosCTR = new NumeroInversosCTR();
        
        int num[]= new int[20];
        
       
        for (int i = 0; i < 20; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero para a posição " + i));
        }
        numeroInversosDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroInversosCTR.imprimirInverso(numeroInversosDTO));
    }
}
