/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex03;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Aluno
 */
public class MotoristaVIEW {
    public static void main(String[] args) {
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();

            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digte a Idade")));
            JOptionPane.showMessageDialog(null, motoristaCTR.imprimir(motoristaDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema " + e.getMessage());
        
        }
    }
}
