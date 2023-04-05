/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_SWITCH_Ex02;

/**
 *
 * @author Aluno
 */
public class Operacao {
    private String opcao;
    private int n1,n2;
    public String  calculo(String opcao,int n1,int n2){
        this.n1=n1;
        this.n2=n2;
        this.opcao= opcao;
        
        switch(opcao){
            case "A":
                return " A operaçao escolhida foi Adição/nSeu resultado foi: " + (this.n1 + this.n2);
            case "S":
                return "A operação escolhida foi Subtração/nSeu resultado foi: " + (this.n1 - this.n2);
            case "M":
                return " A operaçao escolhida foi Multiplicação/nSeu resultado foi: " + (this.n1 * this.n2);
            case "D":
                return "A operação escolhida foi Divisão/nSeu resultado foi: " + (this.n1 / this.n2);
            default:
                return "Opção invalida";
        }
        
    }
}
