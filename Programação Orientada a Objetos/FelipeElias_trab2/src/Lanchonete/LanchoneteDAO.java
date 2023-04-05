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
public class LanchoneteDAO {
    private String mensagem="==========================\nProduto  | Quantidade | Valor \n==========================\n";
    private double contador_h,contador_chese,contador_Misto,contador_Americano,contador_queijo,conta_F,contador_outro,conta;
    
    
     public double Menu(LanchoneteDTO lanchoneteDTO){
        if((lanchoneteDTO.getCodigo()>0)&&(lanchoneteDTO.getCodigo()<6)){
            if(lanchoneteDTO.getCodigo()==1){
                this.contador_h=(1.50 * lanchoneteDTO.getQuantidade());
            }
            else if(lanchoneteDTO.getCodigo()==2){
                this.contador_chese=(1.80 * lanchoneteDTO.getQuantidade());
            }
            else if(lanchoneteDTO.getCodigo()==3){
                this.contador_Misto=(1.20* lanchoneteDTO.getQuantidade());
            }
            else if(lanchoneteDTO.getCodigo()==4){
                this.contador_Americano=(2.00* lanchoneteDTO.getQuantidade());
            }
            else if(lanchoneteDTO.getCodigo()==5){
                this.contador_queijo=(1.00* lanchoneteDTO.getQuantidade());
            }
            this.conta_F =this.contador_h+this.contador_Americano+this.contador_Misto+this.contador_queijo+this.contador_chese+this.contador_outro;  
        }
        
        return this.conta_F;
 } 
     
    
    public String Conta(LanchoneteDTO lanchoneteDTO){
            
       if((lanchoneteDTO.getCodigo()>=0)&&(lanchoneteDTO.getCodigo()<6)){
            if(lanchoneteDTO.getCodigo()==1){
                this.mensagem+="Hamburguer: "+ "    "+lanchoneteDTO.getQuantidade()+ "    R$"+(lanchoneteDTO.getQuantidade()*1.50)+"\n";   
            }
            else if(lanchoneteDTO.getCodigo()==2){
                this.mensagem+="CheseBurguer: " +"    " + lanchoneteDTO.getQuantidade()+ "    R$"+(lanchoneteDTO.getQuantidade()*1.80)+"\n";
            }
            else if(lanchoneteDTO.getCodigo()==3){
                this.mensagem+="Misto quente: " +"    " + lanchoneteDTO.getQuantidade()+ "    R$"+(lanchoneteDTO.getQuantidade()*1.20)+"\n";
            }
            else if(lanchoneteDTO.getCodigo()==4){
                this.mensagem+="Americano: " +"    "  +lanchoneteDTO.getQuantidade()+ "      R$"+(lanchoneteDTO.getQuantidade()*2.00)+"\n";
            }
            else if(lanchoneteDTO.getCodigo()==5){
                this.mensagem+="Queijo Prato: " +"    " + lanchoneteDTO.getQuantidade()+ "    R$"+(lanchoneteDTO.getQuantidade()*1.00)+"\n";
            }
       }else{
           this.mensagem="Codigo invalido";
       }
           
         return this.mensagem;
     } 
}
