/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Introducao_Ex01;

/**
 *
 * @author Aluno
 */
public class Cliente1 {
    private int ano_nasc,ano_atual,resposta;
    
    public int calcularIdade(int ano_nasc, int ano_atual){
    this.ano_nasc = ano_nasc;
    this.ano_atual = ano_atual;
    
    this.resposta = this.ano_atual - this.ano_nasc;
    
    return this.resposta;
    }
    
    
}
