import java.util.Scanner;;

public class App {
  public static void main(String[] args) throws Exception {

    System.out.println("Menu/n 1-saldo /n");
    System.out.println(" digite sua opção: ");
    Scanner scan = new Scanner(System.in);
    int opcao = scan.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("nome: ");
        String nome = scan.nextLine();
        System.out.println("cpf: ");
        int cpf = scan.nextInt();
        System.out.println("Data de nascimento: ");
        String dtn = scan.nextLine();
        System.out.println("rua: ");
        String rua = scan.nextLine();
        System.out.println("bairro: ");
        String bairro = scan.nextLine();
        Endereco endereco = new Endereco("Rua Flores", "Centro", "Picos","123");
        System.out.println(endereco.toString());
       // Cliente cliente = new Cliente(nome, cpf, dtn, bairro);
        break;
    }

  }
}
