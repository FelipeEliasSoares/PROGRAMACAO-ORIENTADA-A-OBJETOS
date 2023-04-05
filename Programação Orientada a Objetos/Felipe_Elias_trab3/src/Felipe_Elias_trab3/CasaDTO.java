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
public class CasaDTO extends ImovelDTO implements ICasaDTO{
    private int n_quarto,n_banheiros;

    public int getN_quarto() {
        return n_quarto;
    }

    public void setN_quarto(int n_quarto) {
        this.n_quarto = n_quarto;
    }

    public int getN_banheiros() {
        return n_banheiros;
    }

    public void setN_banheiros(int n_banheiros) {
        this.n_banheiros = n_banheiros;
    }
}
