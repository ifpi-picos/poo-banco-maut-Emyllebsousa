import java.time.LocalDate;
import java.util.Scanner;
public class Cliente {
  public String nome;
  private int cpf;
  private LocalDate dtn;
  private String endereco;
  private String [] conta = {"Brasil", "Santader", "Picpay", "Caixa"};
  public Cliente(String nome, int cpf, LocalDate dtn, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.dtn = dtn;
    this.endereco = endereco;
}
  public int getCpf() {
    return cpf;
  }
  public LocalDate getDtn() {
    return dtn;
  }
   public String getEndereco() {
    return endereco;
  }
   public String[] getConta() {
    return conta;
  }
Scanner scan= new Scanner(System.in);
  public void Cadastro (String nome, int cpf, LocalDate dtn, String endereço){
    System.out.println("nome: ");
   nome= scan.nextLine(); 
   System.out.println("cpf: ");
   cpf=scan.nextInt();
  
  }
}
