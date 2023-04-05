/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_Encapsulamento_Ex04;

import F_Encapsulamento_Ex03.MotoristaDTO;

/**
 *
 * @author Aluno
 */
public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public String Imprimir(MediaDTO mediaDTO){
        return  mediaDAO.resultado(mediaDTO);
    }
            
}
