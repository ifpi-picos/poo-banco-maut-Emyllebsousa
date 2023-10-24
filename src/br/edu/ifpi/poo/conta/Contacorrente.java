package br.edu.ifpi.poo.conta;

import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacao.Notificacao;

public class Contacorrente extends Conta {
private double cheque;
private double taxa= 0.1;

    public Contacorrente(double saldo, String numero, String numeroag, Cliente cliente, Notificacao notificacao,double taxa) {
    super(saldo, numero, numeroag, cliente, notificacao);
    this.taxa = taxa;
    this.cheque= 1.000;
}

 

    @Override
    public void
     transfere(double valor, Conta destino) {
       
    }

    @Override
    public void sacar(double valor) {
        
    }
public double getTaxa() {
    return taxa;
}

public double getCheque() {
    return cheque;
} 
}
