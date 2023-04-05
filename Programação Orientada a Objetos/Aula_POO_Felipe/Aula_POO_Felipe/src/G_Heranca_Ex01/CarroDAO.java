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
public class CarroDAO extends VeiculaDAO{
    public String imprimirDadosCarro(CarroDTO carroDTO){
        return imprimirDadosVeiculo(carroDTO)+ 
                "\nA Pontencia é: " + carroDTO.getPotencia()+
                "\nA quantidade de portas é: " + carroDTO.getQtd_portas();
    }
}
