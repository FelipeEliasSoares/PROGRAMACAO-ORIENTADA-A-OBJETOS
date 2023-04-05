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
public class DiagonaCTR {
    DiagonalDAO diagonalDAO = new DiagonalDAO();
    
    public String Montar(DiagonalDTO diagonalDTO){
        return diagonalDAO.Montar(diagonalDTO);
    }
   
    
    public String Diagonal(DiagonalDTO diagonalDTO){
        return diagonalDAO.imprimirDiagonal(diagonalDTO);
    }
}
