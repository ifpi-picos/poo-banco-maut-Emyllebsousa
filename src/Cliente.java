

public class Cliente {
  public String nome;
  private int cpf;
  private String dtn;
  private String endereco;
  private String [] conta = {"Brasil", "Santader", "Picpay", "Caixa"};
  public Cliente(String nome, int cpf, String dtn, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.dtn = dtn;
    this.endereco = endereco;
}
  public int getCpf() {
    return cpf;
  }
  public String getDtn() {
    return dtn;
  }
   public String getEndereco() {
    return endereco;
  }
   public String[] getConta() {
    return conta;
  }

  
    
  
  
}
