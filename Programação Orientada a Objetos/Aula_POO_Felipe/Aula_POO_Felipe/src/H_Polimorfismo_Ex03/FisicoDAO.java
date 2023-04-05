/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex03;

/**
 *
 * @author Aluno
 */
public class FisicoDAO extends ClienteDAO{
    public  String mostraDadosCli(FisicoDTO fisicoDTO){
        return  super.mostraDadosCli(fisicoDTO)+
                "\nCPF: " + fisicoDTO.getCpf()+
                "\nRG: " + fisicoDTO.getRg();
    }
}
