/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package K_Matriz_Ex02;

/**
 *
 * @author Aluno
 */
public class DiagonalDAO {
    private String resposta="",resposta2="";
    public String Montar(DiagonalDTO diagonalDTO){
        int n[][] = diagonalDTO.getN();
        
        
        for(int linha=0; linha<20 ; linha++){
            for(int coluna=0; coluna<20 ; coluna++){
                this.resposta += n[linha][coluna] + "  ";
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
    
    //public String imprimir(DiagonalDTO diagonalDTO){
        //return this.resposta;
    
    //} 
    
    public  String imprimirDiagonal(DiagonalDTO diagonalDTO){
      int n[][] = diagonalDTO.getN();
        for(int linha=0; linha<20 ; linha++){
            for(int coluna=0; coluna<20 ; coluna++){
                if(linha == coluna)
                    this.resposta2 += n[linha][coluna] + "  ";
            }
            this.resposta2+= "\n" + "   ";
        }
        return this.resposta2;  
    }
}
