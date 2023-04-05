/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_FOR_Ex06;

import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
       Maior_menor maior_menor = new Maior_menor();
       
       for(int cont= 1;cont<=10;cont++){
        maior_menor.veficacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: ")),
                cont);

                
    }
       
     JOptionPane.showMessageDialog(null, maior_menor.Resultado());
    }
}
