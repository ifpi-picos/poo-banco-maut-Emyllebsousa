package br.edu.ifpi.poo.conta;
import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacao.Notificacao;

// Herança: a classe ContaPoupanca herda todos os atributos e métodos da classe Conta
public class Contapoupanca extends Conta{

private double taxa;
private double taxasaque;
private double rendimento;

 




    public Contapoupanca(double saldo, String numero, String numeroag, Cliente cliente, Notificacao notificacao) {
    super(saldo, numero, numeroag, cliente, notificacao);
    this.taxa=0.1;
    this.taxasaque=0.05;
    this.rendimento=0.1;
  }

    

    @Override
    public void transfere(double valor, Conta destino) {
      sacar(valor);
      this.saldo =- valor * taxa;
      destino.deposito(valor);
      
    }

    @Override
    public void sacar(double valor) {
      this.saldo-= valor * taxasaque;

      System.out.println(getSaldo());
    }

    @Override
    public void deposito(double valor) {
      if(valor>0){
      this.saldo += (valor * getRendimento());
      this.notificacao.enviaNotificacao("deposito", valor);
      addHistoricoTransacao(valor, "deposito");
      }else{
        System.out.println("Deposito nao realizado!!");
      }
    }
public double getTaxa() {
  return taxa;
}
public double getTaxasaque() {
  return taxasaque;
}
public double getRendimento() {
  return rendimento;
}
}
