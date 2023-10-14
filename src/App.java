import java.util.Scanner;;

public class App {
  public static void main(String[] args) throws Exception {

    Cliente a = new Cliente("Emylle","000", "00/00/0000", null);

    Conta c1 = new Conta();
    Conta c2 = new Conta();
    Conta c3 = new Conta();

    System.out.println("Menu/n 1-saldo /n");
    System.out.println(" digite sua opção: ");
    Scanner scan = new Scanner(System.in);
    int opcao = scan.nextInt();

    do {
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
        Endereco endereco = new Endereco("Rua Flores", "Centro", "Picos",123);
        System.out.println(endereco.toString());
   
        break;
    }
    }while (true);
  }
