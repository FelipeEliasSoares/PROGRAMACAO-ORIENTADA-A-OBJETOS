/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NumeroVIEW {
    public static void main(String[] args) {
        NumeroDTO numeroDTO = new NumeroDTO();
        NumeroCTR numeroCTR = new NumeroCTR();
        int num[][] = new int [2][3];
        
        for(int linha=0;linha<2; linha++){
            for(int coluna=0; coluna<3; coluna++){
                num[linha][coluna]= Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha: " + linha + " Coluna: " + coluna));
            }
        }
        numeroDTO.setN(num);
        JOptionPane.showMessageDialog(null, numeroCTR.monstrarMatriz(numeroDTO));
    }
}
