package br.edu.ifpi.poo.conta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacao.Notificacao;
import br.edu.ifpi.poo.transacao.Transacao;

public abstract class Conta {
    
    protected double saldo;
    private String numero;
    private String numeroag;
    private Cliente cliente;
    private List <Transacao> transacao;
    private Notificacao notificacao;

    public Conta(double saldo, String numero, String numeroag, Cliente cliente, Notificacao notificacao) {
        this.saldo = saldo;
        this.numero = numero;
        this.numeroag = numeroag;
        this.cliente = cliente;
        this.notificacao = notificacao;
        this.transacao= new ArrayList<>();
    }

    //----------------------------------------------------------------------------------------------------

    public abstract void transfere(double valor, Conta destino);

    public abstract void sacar(double valor);

    public void doposito(double valor){
    this.saldo+= valor;
    this.notificacao.enviaNotificacao("deposito", valor);
    
    }
    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }
    private void addHistoricoTransacao(double valor, String tipo){
        Transacao t = new Transacao(LocalDate.now(), valor, tipo);
        this.transacao.add(t);
    }
    //-----------------------------------------------------------------------------------------------
    public double getSaldo() {
        return saldo;
    }
    public String getNumeroag() {
            return numeroag;
        }
    public String getNumero() {
            return numero;
        }
    public Cliente getCliente() {
            return cliente;
        }
    public Notificacao getNotificacao() {
        return notificacao;
    }

}
