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
public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "Nome: " + clienteDTO.getNome()+
                "\nEndereco: " + clienteDTO.getEnderaco()+
                ", " + clienteDTO.getNumero()+ 
                "\nCidade: " + clienteDTO.getCidade()+
                "\nEstado: " + clienteDTO.getEstado();
    }

}
