/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class DiagonalVIEW {
    public static void main(String[] args) {
        DiagonaCTR diagonaCTR = new DiagonaCTR();
        DiagonalDTO diagonalDTO = new DiagonalDTO();
        
        int num[][] = new int [20][20];
        
        
        for(int linha=0;linha<2; linha++){
            for(int coluna=0; coluna<2; coluna++){
                num[linha][coluna]= Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha: " + linha + " Coluna: " + coluna));
            }
        }
        diagonalDTO.setN(num);
        //diagonaCTR.Montar(diagonalDTO);
        JOptionPane.showMessageDialog(null, diagonaCTR.Montar(diagonalDTO));
        
        JOptionPane.showMessageDialog(null, diagonaCTR.Diagonal(diagonalDTO));
    }
}
