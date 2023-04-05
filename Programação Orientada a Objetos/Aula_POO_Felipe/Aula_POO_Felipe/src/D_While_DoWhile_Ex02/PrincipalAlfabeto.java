/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class PrincipalAlfabeto {
    public static void main(String[] args) {
        
        String letra="";
        Alfabeto alfabeto = new Alfabeto();
        
        while(!letra.equalsIgnoreCase("0")){
            letra = JOptionPane.showInputDialog("Informe a letra: ");
            alfabeto.contador(letra);
        }
        
        JOptionPane.showMessageDialog(null, alfabeto.Monstrar_dados());
    }
}
