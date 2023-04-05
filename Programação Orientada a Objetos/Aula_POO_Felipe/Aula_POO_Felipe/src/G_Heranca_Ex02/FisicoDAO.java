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
public class FisicoDAO extends ClienteDAO{
    public String imprimirDadosFisco(FisicoDTO fisicoDTO){
        return imprimirDadosCliente(fisicoDTO)+
                "\nCPF " + fisicoDTO.getCpf()+
                "\nRG" + fisicoDTO.getRg();
    }
}
