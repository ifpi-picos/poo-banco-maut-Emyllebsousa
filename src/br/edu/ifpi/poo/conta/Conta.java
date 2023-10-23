package br.edu.ifpi.poo.conta;

import javax.management.Notification;

import br.edu.ifpi.poo.cliente.Cliente;

public abstract class Conta {



    protected double saldo;
    private String numero;
    private String numeroag;
    private Notification notificacao;
    private Cliente cliente;



    public Conta(double saldo, String numero, String numeroag, Cliente cliente) {
        this.saldo = saldo;
        this.numero = numero;
         this.numeroag = numeroag;
        this.cliente = cliente;
    }
    public void saque(double valor){
        this.saldo -=  valor;
        this.notificacao.enviaNotificacao("saque", valor);
    }

    public double getSaldo() {
        return saldo;
    }



}
