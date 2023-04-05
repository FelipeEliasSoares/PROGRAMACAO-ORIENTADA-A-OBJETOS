/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J_Vetor_Ex02;

/**
 *
 * @author Aluno
 */
public class NumerosInversosDAO {
    private String normal="";
    private String resposta="";
    public String ImprimirInverso(NumeroInversosDTO numeroInversosDTO){
        int n[]= numeroInversosDTO.getN();

        
        for (int i = 19; i >=0; i--) {
            this.resposta += n[i] + "\n";
        }
        
        return resposta;
    }
}
