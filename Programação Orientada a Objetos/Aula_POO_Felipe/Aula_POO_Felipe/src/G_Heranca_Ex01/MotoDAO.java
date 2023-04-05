/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G_Heranca_Ex01;

/**
 *
 * @author Aluno
 */
public class MotoDAO extends VeiculaDAO{
    public String imprimiDadosMoto(MotoDTO motoDTO){
        return imprimirDadosVeiculo(motoDTO) + "\nA Cilindrada é: " + motoDTO.getCilindrada()+
                "\n tipo do Motor " + motoDTO.getTipo_motor();
    }
}
