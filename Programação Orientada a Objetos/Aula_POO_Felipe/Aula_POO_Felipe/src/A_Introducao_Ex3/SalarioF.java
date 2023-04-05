/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex3;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class SalarioF {
    
    public static void main(String[] args){
    Salario salario = new Salario();
    
    float salarioB,porcentagem;
    
    salarioB= Float.parseFloat(JOptionPane.showInputDialog("Informe o salario: "));
    porcentagem= Float.parseFloat(JOptionPane.showInputDialog("Informe o porcentagem: "));  
    
    JOptionPane.showMessageDialog(null, "O seu salario final foi " + salario.calcularSalario(salarioB,porcentagem));
    }
            
}
