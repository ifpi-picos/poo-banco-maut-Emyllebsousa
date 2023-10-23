package br.edu.ifpi.poo.conta;



import br.edu.ifpi.poo.cliente.Cliente;

public abstract class Conta {



    protected double saldo;
    private String numero;
    private String numeroag;
    
   
        


    private Cliente cliente;



    public Conta(double saldo, String numero, String numeroag, Cliente cliente) {
        this.saldo = saldo;
        this.numero = numero;
         this.numeroag = numeroag;
        this.cliente = cliente;
        
    }
    public abstract void transfere(double valor, Conta destino);

    public void saque(double valor){
        this.saldo -=  valor;
    }

    public double getSaldo() {
        return saldo;
    }



}
