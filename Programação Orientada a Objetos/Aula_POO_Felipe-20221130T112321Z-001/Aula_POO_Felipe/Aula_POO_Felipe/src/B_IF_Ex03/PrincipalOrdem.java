/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex03;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalOrdem {
    public static void main(String[] args){
        Ordem ordem = new Ordem();
        
        JOptionPane.showMessageDialog(null,"A ordem é : " + ordem.calculo(
           Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:")), 
           Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:")),      
           Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero:")),      
           Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto numero:"))      
                ));

    }
}
