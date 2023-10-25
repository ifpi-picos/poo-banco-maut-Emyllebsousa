import br.edu.ifpi.poo.entidades.Cliente;
import br.edu.ifpi.poo.entidades.Conta;
import br.edu.ifpi.poo.entidades.Contacorrente;
import br.edu.ifpi.poo.entidades.Contapoupanca;
import br.edu.ifpi.poo.entidades.Endereco;
import br.edu.ifpi.poo.notificacao.NotificacaoEmail;
import br.edu.ifpi.poo.notificacao.NotificacaoSms;



public class App {

    public static void main(String[] args) throws Exception {
    Cliente A= new Cliente("Emy", "000.000.000-01", "08/03/2005", new Endereco("Rua das Flores", "Centro", "Dom Expedito", 55));
        Conta conta1 = new Contacorrente("001","111", A,new NotificacaoEmail(), 0);
        Conta conta2 = new Contapoupanca("002", "222", A, new NotificacaoSms());

conta1.deposito(150);
conta1.transfere(10, conta2);
System.out.println(conta1.getSaldo());
conta1.transfere(10, conta2);
System.out.println(conta1.getSaldo());
conta1.transfere(10, conta2);
System.out.println(conta1.getSaldo());
conta1.transfere(10, conta2);
System.out.println(conta1.getSaldo());


      
    }
}
