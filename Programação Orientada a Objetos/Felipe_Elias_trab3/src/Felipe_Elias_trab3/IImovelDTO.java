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
public interface IImovelDTO {
   public void setEndereco(String endereco);
   public void setBairro(String bairro);
   public void setCidade(String cidade);
   public void setProprietario(String proprietario);
   public void setNumero(int numero); 
    
   public String getEndereco();
   public String getBairro();
   public String getCidade();
   public String getProprietario();
   public int getNumero();

}
