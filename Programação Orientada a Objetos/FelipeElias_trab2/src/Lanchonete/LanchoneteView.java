/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanchonete;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class LanchoneteView {
    public static void main(String[] args) {
        LanchoneteCTR lanchoneteCTR = new LanchoneteCTR();
        LanchoneteDTO lanchoneteDTO = new LanchoneteDTO();
        int codigo=-1;
        
        try {
           do{
                codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite a opçao:\n\n1-Hamburguer\n2-CheeseBurguer\n3-Misto Quente\n4-Americano\n5-Queijo Pratoz\n0-Fechar conta\nDigite o codigo:"));
                lanchoneteDTO.setCodigo(codigo);
                if((codigo>=0)&&(codigo<6)){
                    if(codigo!=0){
                        lanchoneteDTO.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digete a quantidade:")));
                        lanchoneteCTR.MonstrarFatural(lanchoneteDTO);
                        lanchoneteCTR.Intens(lanchoneteDTO);
                    }
                    if(lanchoneteDTO.getCodigo()==0){
                        JOptionPane.showMessageDialog(null, lanchoneteCTR.Intens(lanchoneteDTO)+"Total: "+lanchoneteCTR.MonstrarFatural(lanchoneteDTO));
                    }//if2
                }
                else{
                    JOptionPane.showMessageDialog(null, lanchoneteCTR.Intens(lanchoneteDTO));
                    break;
                }
             }while(lanchoneteDTO.getCodigo()!=0); 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro no sistema" + e.getMessage());
        }
        
    }
}
