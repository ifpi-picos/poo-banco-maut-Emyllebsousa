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
    protected Notificacao notificacao;

    public Conta(String numero, String numeroag, Cliente cliente, Notificacao notificacao) {
        this.numero = numero;
        this.numeroag = numeroag;
        this.cliente = cliente;
        this.notificacao = notificacao;
        this.transacao= new ArrayList<>();
        this.saldo = 0.0;
    }

    //----------------------------------------------------------------------------------------------------
    

    public abstract void transfere(double valor, Conta destino);

    public abstract void sacar(double valor);

    public abstract void deposito(double valor);

    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void exibeExtrato(){
        this.transacao.forEach(t -> System.out.println(t));
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("################");
    }
    
    protected void addHistoricoTransacao(double valor, String tipo){
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
