/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex4;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuário
 */
public class Produtos {
    
    public static void main(String[] args){
    Calcular calcular = new Calcular();
    
    float vendas,salarioB,quantidade;
    
    vendas= Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da suas vendas: "));
    salarioB= Float.parseFloat(JOptionPane.showInputDialog("Infomer o seu salario"));
    quantidade= Float.parseFloat((JOptionPane.showInputDialog("Informe a quantidade de vendas")));
    
    
    JOptionPane.showMessageDialog(null,"o seu salario final foi " + calcular.calcularSalario(salarioB, vendas,quantidade));
}
}
