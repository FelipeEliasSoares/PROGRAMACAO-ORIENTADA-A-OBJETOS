/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Heranca_Ex02;

/**
 *
 * @author Aluno
 */
public class JuridicoDAO extends FisicoDAO{
    public String imprimirDadosJuridico(JuridicoDTO juridicoDTO){
        return imprimirDadosCliente(juridicoDTO) +
               "\nCNPJ " + juridicoDTO.getCnpj()+
               "\nIE " +juridicoDTO.getIe();
    }
}
