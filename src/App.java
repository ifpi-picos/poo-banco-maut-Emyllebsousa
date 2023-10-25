import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.conta.Conta;
import br.edu.ifpi.poo.conta.Contacorrente;
import br.edu.ifpi.poo.conta.Contapoupanca;
import br.edu.ifpi.poo.endereco.Endereco;
import br.edu.ifpi.poo.notificacao.NotificacaoEmail;
import br.edu.ifpi.poo.notificacao.NotificacaoSms;



public class App {

    public static void main(String[] args) throws Exception {
    Cliente A= new Cliente("Emy", "000.000.000-01", "08/03/2005", new Endereco("Rua das Flores", "Centro", "Dom Expedito", 55));
        Conta conta1 = new Contacorrente("001","111", A,new NotificacaoEmail(), 0);
        Conta conta2 = new Contapoupanca("002", "222", A, new NotificacaoSms());


      conta2.deposito(100);
      System.out.println(conta2.getSaldo());

      conta2.sacar(50);
      System.out.println(conta2.getSaldo());

      
    }
}
