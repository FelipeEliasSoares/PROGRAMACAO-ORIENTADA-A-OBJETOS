/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincaipalTabuada {
    public static void main(String[] args) {
        Tabuada tabuada = new  Tabuada();
        
        JOptionPane.showMessageDialog(null,
                tabuada.calcular(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da para calcular a tabuada: ")))
        );
    }
}
