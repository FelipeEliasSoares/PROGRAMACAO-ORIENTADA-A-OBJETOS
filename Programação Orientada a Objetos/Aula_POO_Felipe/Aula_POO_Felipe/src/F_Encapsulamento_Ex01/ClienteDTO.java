/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex01;

/**
 *
 * @author Aluno
 */
public class ClienteDTO {
    
    private String nome, rg;
    private int idade;

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}//Fecha a classe ClienteDTO
