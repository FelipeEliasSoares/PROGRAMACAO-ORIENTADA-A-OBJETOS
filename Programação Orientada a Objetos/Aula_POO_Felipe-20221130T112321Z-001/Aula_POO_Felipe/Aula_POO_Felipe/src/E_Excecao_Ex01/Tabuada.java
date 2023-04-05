/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Excecao_Ex01;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    private  int numero;
    private  String resp="";
    public String calcular(int numero){
        try{
            this.numero=numero;
            for(int cont=1;cont<=10;cont++){
                this.resp += this.numero +" x "+cont+ " = " +this.numero*cont+"\n";  
            }
            return this.resp;
        }//try
        catch(Exception e){
            return this.resp;
        }//catch
    }
}
