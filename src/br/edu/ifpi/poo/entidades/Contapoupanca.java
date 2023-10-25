package br.edu.ifpi.poo.entidades;
import br.edu.ifpi.poo.notificacao.Notificacao;

// Herança: a classe ContaPoupanca herda todos os atributos e métodos da classe Conta
public class Contapoupanca extends Conta{

private double taxa;
private double taxasaque;
private double rendimento;


    public Contapoupanca(String numero, String numeroag, Cliente cliente, Notificacao notificacao) {
    super(numero, numeroag, cliente, notificacao);
    this.taxa=0.1;
    this.taxasaque=0.05;
    this.rendimento=0.1;
  }

  //---------------------------------------------------------------------------------------------------------------  

    @Override
    public void transfere(double valor, Conta destino) {
      
      sacar(valor);

      this.saldo =- valor * taxa;

      destino.deposito(valor);

      //-------------------------------------------------------------
      this.notificacao.enviaNotificacao("transação: ", valor);
      addHistoricoTransacao(valor, "transação");
      //--------------------------------------------------------------
    }

    @Override
    public void sacar(double valor) {

      this.saldo-= valor +(valor*taxasaque);

      //-----------------------------------------------------------------
      this.notificacao.enviaNotificacao("Saque", valor);
      addHistoricoTransacao(valor, "saque");
      //------------------------------------------------------------------
    }

    @Override
    public void deposito(double valor) {

      if(valor>0){
      this.saldo += (valor + (valor * 0.1));

      //-----------------------------------------------------------------------
      this.notificacao.enviaNotificacao("deposito", valor);
      addHistoricoTransacao(valor, "deposito");
      //------------------------------------------------------------------------
      }else{

      System.out.println("ESTE DEPOSITO NÃO PODE SER REALIZADO!");

      }
    }

    //---------------------------------------------------------------------------------------------------------
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
