/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex01;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    public String  monstrarInfomarcoes(ClienteDTO clienteDTO){
        return "O nome informado foi: " + clienteDTO.getNome()+
                "\nO RG infomado foi: " + clienteDTO.getRg()+
                verifica(clienteDTO.getIdade())+
                verifica(clienteDTO.getAltura());
    }
    
    public String verifica(int idade){
        if(idade>18){
            return "\n Idade maior que 18 anos, pode entrar no brinquedo";
        }
        else{
            return "\nIdade menor que 18 anos, não pode entrar no briquedo";
        }
    }//fecha metado
    
    public String verifica(double altura){
        if(altura >1.50){
            return "\n Altura maior que 1.50, pode entrar no brinquedo: ";
        }
        else{
            return "\nAltura menor que 1.50, não pode entrar no brinquero";
        }
    }//fecha metado 
}

