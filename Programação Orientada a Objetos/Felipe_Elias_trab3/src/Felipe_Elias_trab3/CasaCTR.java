/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Felipe_Elias_trab3;

/**
 *
 * @author Usuário
 */
public class CasaCTR {
    CasaDAO casaDAO = new CasaDAO();
    public String publicarDados(CasaDTO casaDTO){
        return casaDAO.publicarDados(casaDTO);
    }
}
