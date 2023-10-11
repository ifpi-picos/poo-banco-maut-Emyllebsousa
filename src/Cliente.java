//--------------------------------CLASSE-----------------------------------------------
public class Cliente {

  public String nome;
  private final String cpf;
  private String dtn;
  private Endereco endereco;
 
// ---------------------------------METODO CONSTRTOR-------------------------------------
  public Cliente(String nome, String cpf, String dtn, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.dtn = dtn;
    this.endereco = endereco;
  }
// ---------------------------------GET E SET ---------------------------------------------
  public String getNome() {
   return nome;
  }
   public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getDtn() {
    return dtn;
  }

  public Endereco getEndereco() {
    return endereco;
  }
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }



}
