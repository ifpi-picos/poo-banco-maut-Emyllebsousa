import java.util.ArrayList;

public class Cliente {
  public String nome;
  private int cpf;
  private String dtn;
  private Endereco endereco;
  ArrayList<String> Conta= new ArrayList<String>();

  public Cliente(String nome, int cpf, String dtn, Endereco endereco) {
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

  public Endereco getEndereco() {
    return endereco;
  }


}
