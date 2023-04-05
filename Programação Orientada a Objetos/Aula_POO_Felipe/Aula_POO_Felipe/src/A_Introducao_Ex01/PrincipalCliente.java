
package A_Introducao_Ex01;
import javax.swing.JOptionPane;

public class PrincipalCliente {
  public static void main(String[] argvs){
      Cliente cliente = new Cliente();
      String nome,rg;
      int idade;
      
      nome = JOptionPane.showInputDialog("Informe o Nome:");
      rg = JOptionPane.showInputDialog("Informe o RG:");
      idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
      
      
      cliente.Mostrar(nome, rg);
      cliente.mostrarNome(nome);
      cliente.montrarIdade(idade);
  }
}
