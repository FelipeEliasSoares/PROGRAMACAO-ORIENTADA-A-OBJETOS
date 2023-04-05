/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex2;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Notas {
    
    public static void main(String[] args){
    Media media = new Media();
     
    double nota1,peso1,nota2,peso2,nota3,peso3;
    
    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 1: "));
    peso1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da nota 1: "));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 2: "));
    peso2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da nota 2: "));
    nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 3: "));
    peso3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da nota 3: "));
    
    JOptionPane.showMessageDialog(null, "A media das notas foi: "  + media.calcularMedia(nota1,nota2,nota3,peso1,peso2,peso3));
}
}
