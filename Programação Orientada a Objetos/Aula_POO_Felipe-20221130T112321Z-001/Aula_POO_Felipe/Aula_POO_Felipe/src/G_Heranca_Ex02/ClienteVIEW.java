/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Heranca_Ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteVIEW {
    public static void main(String[] args) {

        try {
            FisicoDTO fisicoDTO = new FisicoDTO();
            FisicoCTR fisicoCTR = new FisicoCTR();
            
            fisicoDTO.setNome(JOptionPane.showInputDialog("Digire Nome"));
            fisicoDTO.setEnderaco(JOptionPane.showInputDialog("Digire Endereco"));
            fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digete o numero")));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("Digire Cidade"));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("Digire Estado"));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("Digete o CPF"));
            fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG"));
            
            JOptionPane.showMessageDialog(null, fisicoCTR.imprimirDadosFisico(fisicoDTO));
            
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoCTR juridicoCTR = new JuridicoCTR();
            
            juridicoDTO.setNome(JOptionPane.showInputDialog("Digire Nome"));
            juridicoDTO.setEnderaco(JOptionPane.showInputDialog("Digire Endereco"));
            juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digete o numero")));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("Digire Cidade"));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("Digire Estado"));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("Digite o CNPJ"));
            juridicoDTO.setIe(JOptionPane.showInputDialog("Digite o IE"));
            
            JOptionPane.showMessageDialog(null, juridicoCTR.imiprimirDadosJurico(juridicoDTO));
            
        } catch (Exception e) {
        }

    }
}
