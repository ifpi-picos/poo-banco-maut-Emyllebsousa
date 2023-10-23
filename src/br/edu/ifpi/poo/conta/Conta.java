package br.edu.ifpi.poo.conta;
import br.edu.ifpi.poo.cliente.Cliente;
import br.edu.ifpi.poo.notificacao.Notificacao;

public abstract class Conta {

    protected double saldo;
    private String numero;
    private String numeroag;
    private Cliente cliente;
    private Notificacao notificacao;

    public Conta(double saldo, String numero, String numeroag, Cliente cliente, Notificacao notificacao) {
        this.saldo = saldo;
        this.numero = numero;
        this.numeroag = numeroag;
        this.cliente = cliente;
        this.notificacao = notificacao;
        
    }

    //----------------------------------------------------------------------------------------------------
    public abstract void transfere(double valor, Conta destino);

    public void saque(double valor){
        this.saldo -=  valor;
    }
    public void doposito(double valor){
    this.saldo+= valor;
    
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
