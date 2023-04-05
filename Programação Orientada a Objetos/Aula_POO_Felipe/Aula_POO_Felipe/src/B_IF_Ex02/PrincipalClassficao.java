/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex02;
import A_Introducao_Ex4.Calculo;
import  javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalClassficao {
    public static void main(String[] args){
        Classificao classificao = new Classificao();
        
        JOptionPane.showMessageDialog(null,"A classificao é: " + classificao.calculo( 
                Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos "))
        )
        );
    }
}
