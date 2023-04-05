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
public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String imprimirDadosFisico(FisicoDTO fisicoDTO){
        return  fisicoDAO.imprimirDadosFisco(fisicoDTO);
    }
}
