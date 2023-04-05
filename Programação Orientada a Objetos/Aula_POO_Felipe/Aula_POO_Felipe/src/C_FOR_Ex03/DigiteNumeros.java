/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class DigiteNumeros {
    public static void main(String[] args) {
        LerNumeros lernumero= new LerNumeros();
        
        
        for(int cont=1;cont<10;cont++){
            lernumero.soma(
            Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "))
            );
       }
        
       JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + lernumero.monstrar_soma());
    }
}
