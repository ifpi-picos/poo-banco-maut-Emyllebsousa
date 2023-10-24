package br.edu.ifpi.poo.conta;

import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacao.Notificacao;

public class Contacorrente extends Conta {


private double taxa= 0.1;

    public Contacorrente(double saldo, String numero, String numeroag, Cliente cliente, Notificacao notificacao,double taxa) {
    super(saldo, numero, numeroag, cliente, notificacao);
    this.taxa = taxa;
}

    public double getTaxa() {
    return taxa;
}

    @Override
    public void
     transfere(double valor, Conta destino) {
        // implementar o comportamento da transferencia de ContaCorrente aqui
    }
    
}
