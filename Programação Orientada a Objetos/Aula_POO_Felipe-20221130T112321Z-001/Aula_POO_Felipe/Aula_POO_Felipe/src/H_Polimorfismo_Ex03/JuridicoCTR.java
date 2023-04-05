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
public class JuridicoCTR {
    JuridicoDAO juridicoDAO =new JuridicoDAO();
    public String mosntraDadosClie(JuridicoDTO juridicoDTO){
        return juridicoDAO.monstraDadosClie(juridicoDTO);
    }
}
