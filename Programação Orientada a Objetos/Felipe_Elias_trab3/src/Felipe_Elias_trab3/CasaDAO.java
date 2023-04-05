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
public class CasaDAO implements ICasaDAO{
    private String mensagem;
    public String publicarDados(CasaDTO casaDTO){
        this.mensagem= "Nome do Proprietario: " + casaDTO.getProprietario()+
                        "\nCidade: " + casaDTO.getCidade()+
                        "\nBairro: " + casaDTO.getBairro()+
                        "\nEndereço: " + casaDTO.getEndereco()+
                        "\nNumero: " + casaDTO.getNumero() +
                        "\nNumero de Quartos: " + casaDTO.getN_quarto()+
                        "\nNumero de Banheiros: " + casaDTO.getN_banheiros();
                  
        return mensagem;
    }
}
