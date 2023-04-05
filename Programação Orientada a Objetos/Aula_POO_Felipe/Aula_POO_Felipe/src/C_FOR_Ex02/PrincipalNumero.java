/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalNumero {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1:"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2:"));
        JOptionPane.showMessageDialog(null,numeros.intervalo(n1, n2));
        
    }
}
