/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanchonete;

/**
 *
 * @author Usuário
 */
public class LanchoneteCTR {
    LanchoneteDAO lanchoneteDAO = new LanchoneteDAO();
    
    public Double MonstrarFatural(LanchoneteDTO lanchoneteDTO){
        return lanchoneteDAO.Menu(lanchoneteDTO);
    }
    
    public String Intens(LanchoneteDTO lanchoneteDTO){
        return lanchoneteDAO.Conta(lanchoneteDTO);
    }
}
