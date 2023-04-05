/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex01;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalCliente1 {
    
    public static void main(String[] args){    
    Cliente1 cliente1 = new Cliente1();
    
    int ano_nasc, ano_atual;
    
    ano_nasc  = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano nasc: "));
    ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano atual: "));
    
    JOptionPane.showMessageDialog(null, "A idade em anos é : " + cliente1.calcularIdade(ano_nasc,ano_atual));
    
    }

}
