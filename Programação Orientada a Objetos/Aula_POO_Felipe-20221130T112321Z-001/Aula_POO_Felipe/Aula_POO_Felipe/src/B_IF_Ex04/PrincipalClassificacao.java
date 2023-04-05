/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex04;
import  javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalClassificacao {
    public static void main(String[] args){
        Classificacao classificacao = new Classificacao();
        
        JOptionPane.showMessageDialog(null,"Sua classificação é : "+ classificacao.tabela(
            Double.parseDouble(JOptionPane.showInputDialog("Digite sua attura: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Digite sua peso: "))
        ));

    }
}
