/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_SWITCH_Ex02;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalOperacao {
    public static void main(String[] args) {
        
        Operacao operacao = new Operacao();
        int n1,n2;
        String opcao;
        
       opcao= JOptionPane.showInputDialog("A-Adição\nS-Subtração\nD-Divisao\nM-Multiplicação\n\nDigite a sua opcao:");
       n1= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1: "));
       n2= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero dois: "));
       
       JOptionPane.showMessageDialog(null, operacao.calculo(opcao, n1, n2));
    }
}
