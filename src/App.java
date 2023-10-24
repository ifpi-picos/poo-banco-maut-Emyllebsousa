import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.conta.Conta;
import br.edu.ifpi.poo.conta.Contacorrente;
import br.edu.ifpi.poo.conta.Contapoupanca;



public class App {
    public static void main(String[] args) throws Exception {
        Cliente A= new Cliente(null, null, null, null);
        Conta conta1 = new Contacorrente(50, "001","111", A,null, 0);
        Conta conta2 = new Contapoupanca(0, "002", "222", A, null);
       
    conta1.getSaldo();
    conta2.getSaldo();
    }
}
