import br.edu.ifpi.poo.entidades.Cliente;
import br.edu.ifpi.poo.entidades.Conta;
import br.edu.ifpi.poo.entidades.Contacorrente;
import br.edu.ifpi.poo.entidades.Contapoupanca;
import br.edu.ifpi.poo.entidades.Endereco;
import br.edu.ifpi.poo.notificacao.NotificacaoEmail;
import br.edu.ifpi.poo.notificacao.NotificacaoSms;



public class App {

    public static void main(String[] args) throws Exception {
        Cliente A = new Cliente("Emy", "000.000.000-01", "08/03/2005",
                new Endereco("Rua das Flores", "Centro", "Dom Expedito", 55));
        Conta cc = new Contacorrente("001", "111", A, new NotificacaoEmail(), 0.1);
        Conta cc2 = new Contacorrente("001", "111", A, new NotificacaoEmail(), 0);
        Conta cp = new Contapoupanca("002", "222", A, new NotificacaoSms());

        cc.deposito(100);
        System.out.println(cc.getSaldo());
        cc.sacar(50);
        System.out.println(cc.getSaldo());
        cc.transfere(10, cc2);
        cc.transfere(10, cc2);
        cc.transfere(10, cc2);
        cc.transfere(10, cc2);
        cc.transfere(10, cc2);
        cc.transfere(10, cc2);
        System.out.println(cc.getSaldo());
        cc.exibeExtrato();

        cp.deposito(100);
        cp.sacar(10);

        System.out.println(cp.getSaldo());
        cp.exibeExtrato();

        // parabéns, tudo certo

    }
}
