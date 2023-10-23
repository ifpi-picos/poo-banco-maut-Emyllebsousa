package br.edu.ifpi.poo.conta;

import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacao.Notificacao;

public class Contacorrente extends Conta {


private double taxa= 0.1;

   // public void ContaCorrente(String numero, double abertura, Notificacao notificacao) {
       // super(numero, abertura, notificacao);
    //}

    public double getTaxa() {
    return taxa;
}

    @Override
    public void
     transfere(double valor, Conta destino) {
        // implementar o comportamento da transferencia de ContaCorrente aqui
    }
}
