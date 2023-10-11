import java.util.ArrayList;
//--------------------------------CLASSE-----------------------------------------------
public class Cliente {

  public String nome;
  private int cpf;
  private String dtn;
  private Endereco endereco;
 
// ---------------------------------METODO CONSTRTOR-------------------------------------
  public Cliente(String nome, int cpf, String dtn, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.dtn = dtn;
    this.endereco = endereco;
  }
// ---------------------------------GET E SET ---------------------------------------------
  public String getNome() {
   return nome;
  }

  public int getCpf() {
    return cpf;
  }

  public String getDtn() {
    return dtn;
  }

  public Endereco getEndereco() {
    return endereco;
  }


}
