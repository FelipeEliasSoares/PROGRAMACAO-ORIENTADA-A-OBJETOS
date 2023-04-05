/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_While_DoWhile_Ex03;

import javax.swing.JOptionPane;

/**
 *  
* @author Aluno
 */   
public class PrincipalAudiencia {
    public static void main(String[] args) {
        
        
        int canal;
        Audiencia audiencia = new Audiencia();
        
        do{
            canal=Integer.parseInt(JOptionPane.showInputDialog("Informe o canal para pesquisa\n(9,12,23 ou 40)\n 0 para sair: "));
            audiencia.pesquisa(canal);
        }while(canal !=0);
        
        JOptionPane.showMessageDialog(null, audiencia.imprimir());
    }
}
