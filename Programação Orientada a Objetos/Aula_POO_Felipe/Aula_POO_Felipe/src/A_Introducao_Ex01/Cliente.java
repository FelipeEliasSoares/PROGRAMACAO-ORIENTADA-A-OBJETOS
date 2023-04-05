
package A_Introducao_Ex01;
import javax.swing.JOptionPane;

public class Cliente {
    private String nome,rg;
    private int idade;
    
    public void Mostrar(String nome,String rg){
        this.nome = nome;
        this.rg = rg;
        
        JOptionPane.showMessageDialog(null, "O nome informado foi: " +
                this.nome + "\n O RG informado foi : " + this.rg);
    }
    
    
    public void mostrarNome(String nome){
        this.nome = nome;
        
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome);
    }
    
    public void montrarIdade(int idade){
        this.idade = idade;
        JOptionPane.showMessageDialog(null, " A idade informada foi " + idade);
    }
    
}//fecha a classe+
