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
public class ClienteDAO {
    public String imprimirDadosCliente(ClienteDTO clienteDTO){
        return "Nome: " + clienteDTO.getNome()+ 
               "\nEndereço: " + clienteDTO.getEnderaco()+
               "\nCidade: " + clienteDTO.getCidade()+
               "\nNumero: " + clienteDTO.getNumero()+
               "\nEstado: " + clienteDTO.getEstado();
        
    }
}
