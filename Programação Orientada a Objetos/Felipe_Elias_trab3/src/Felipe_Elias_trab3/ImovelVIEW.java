/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Felipe_Elias_trab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class ImovelVIEW {
    public static void main(String[] args) {
        CasaCTR casaCTR = new CasaCTR();
        CasaDTO casaDTO = new CasaDTO();
        try {
            casaDTO.setProprietario(JOptionPane.showInputDialog("Informe o nome do proprietario: "));
            casaDTO.setCidade(JOptionPane.showInputDialog("Informe a Cidade: "));
            casaDTO.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
            casaDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: ")));
            casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quartos: ")));
            casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de banheiros: ")));
            
            JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
