/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H_Polimorfismo_Ex02;

import G_Heranca_Ex02.ClienteDAO;

/**
 *
 * @author Aluno
 */
public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public void calcular(MediaDTO mediaDTO){
        mediaDAO.calcularMedia(mediaDTO);
    }
    
    public String monstrarMedia(MediaDTO mediaDTO){
        return mediaDAO.Imprimir();
    }
}
