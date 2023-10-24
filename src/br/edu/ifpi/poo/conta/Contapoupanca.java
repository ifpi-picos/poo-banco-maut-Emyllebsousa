package br.edu.ifpi.poo.conta;
import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacao.Notificacao;

// Herança: a classe ContaPoupanca herda todos os atributos e métodos da classe Conta
public class Contapoupanca extends Conta{
    public Contapoupanca(double saldo, String numero, String numeroag, Cliente cliente, Notificacao notificacao) {
    super(saldo, numero, numeroag, cliente, notificacao);
  }

    // Sobrescrita do método de saque, já que na ContaPoupanca o saque é diferente da Conta normal,
    // visto que na ContaPoupanca é cobrado uma taxa de 10% do valor
   

    @Override
    public void transfere(double valor, Conta destino) {
    // implementar o comportamento da transferencia de ContaPoupanca aqui
    }

    @Override
    public void sacar(double valor) {
      
      
    }
}
