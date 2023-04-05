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
public class JuridicoDAO extends ClienteDAO{
    public String monstraDadosClie(JuridicoDTO juridicoDTO){
         return  super.mostraDadosCli(juridicoDTO) + 
                 "\nCNPJ: " + juridicoDTO.getCnpj()+
                 "\nIe: " + juridicoDTO.getIe();
    }
}
