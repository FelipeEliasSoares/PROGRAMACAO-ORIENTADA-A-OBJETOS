/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex04;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalAltura {
    public static void main(String[] args) {
        Altura altura = new Altura();
        
        for(int cont=0;cont<20;cont++){
            altura.soma(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura")));
        }
        
        JOptionPane.showMessageDialog(null, "A media das alturas foi: "+ altura.media());
        
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas mais de 2 netros foi: "+ altura.quantidade());

    }
}
