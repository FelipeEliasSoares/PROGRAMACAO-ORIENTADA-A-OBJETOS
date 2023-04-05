/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteVIEW {
    public static void main(String[] args) {

        try {
            FisicoDTO fisicoDTO = new FisicoDTO();
            FiscoCTR fisicoCTR = new FiscoCTR();
            
            fisicoDTO.setNome(JOptionPane.showInputDialog("Digire Nome"));
            fisicoDTO.setEnderaco(JOptionPane.showInputDialog("Digire Endereco"));
            fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digete o numero")));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("Digire Cidade"));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("Digire Estado"));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("Digete o CPF"));
            fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG"));
            
            JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosClie(fisicoDTO));
            
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoCTR juridicoCTR = new JuridicoCTR();
            
            juridicoDTO.setNome(JOptionPane.showInputDialog("Digire Nome"));
            juridicoDTO.setEnderaco(JOptionPane.showInputDialog("Digire Endereco"));
            juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digete o numero")));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("Digire Cidade"));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("Digire Estado"));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("Digite o CNPJ"));
            juridicoDTO.setIe(JOptionPane.showInputDialog("Digite o IE"));
            
            JOptionPane.showMessageDialog(null, juridicoCTR.mosntraDadosClie(juridicoDTO));
            
        } catch (Exception e) {
        }

    }
}
