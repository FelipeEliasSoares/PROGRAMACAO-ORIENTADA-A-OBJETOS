/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex05;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Aluno
 */
public class PrincipalSalario {
    public static void main(String[] args) {
        DecimalFormat formatando = new DecimalFormat("##,###.00");
        AumentoSalario aumentoSalario = new AumentoSalario();
        
        JOptionPane.showMessageDialog(null,
                "Novo salario é: "+
                 formatando.format(
                     aumentoSalario.Salario(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: ")))
                 )
                );
    }
    
}
