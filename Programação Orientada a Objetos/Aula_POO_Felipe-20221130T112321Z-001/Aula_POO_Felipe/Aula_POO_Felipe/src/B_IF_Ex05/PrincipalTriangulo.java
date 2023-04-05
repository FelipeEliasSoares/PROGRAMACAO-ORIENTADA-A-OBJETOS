/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex05;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class PrincipalTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        
        JOptionPane.showMessageDialog(null, "O Triangulo é "+triangulo.determinante(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o Lado X: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o Lado Y: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o Lado z: "))));
    }
}
