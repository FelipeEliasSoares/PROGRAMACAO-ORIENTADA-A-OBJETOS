/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex01;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalWhile {
    public static void main(String[] args) {
        int numero=1;
        Exemplowhile exemplowhile = new Exemplowhile();
        
        while(numero !=0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
            exemplowhile.somar(numero);
        }
        JOptionPane.showMessageDialog(null, exemplowhile.mostra());
    }
}
