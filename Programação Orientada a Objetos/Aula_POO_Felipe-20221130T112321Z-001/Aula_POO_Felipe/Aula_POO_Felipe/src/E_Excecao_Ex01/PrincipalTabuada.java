/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Excecao_Ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalTabuada {
    public static void main(String[] args) {
        try{
            Tabuada tabuada = new Tabuada();
            JOptionPane.showMessageDialog(null, tabuada.calcular(
                Integer.parseInt(
                        JOptionPane.showInputDialog("Informe o numero")
                )
            ));
        }//try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro 001");
            System.out.println("Erro: " + e.getMessage());
        }//catch
        finally{
            JOptionPane.showMessageDialog(null, "Fim do sistema");
        }//finally
    }
}
