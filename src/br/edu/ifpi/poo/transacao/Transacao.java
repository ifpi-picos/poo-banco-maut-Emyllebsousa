package br.edu.ifpi.poo.transacao;

import java.time.LocalDate;

public class Transacao {
    private LocalDate data;
    private double valor;
    private String tipo;
     
  
    public Transacao(LocalDate data, double valor, String tipo) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
    }
    public LocalDate getData() {
        return data;
    }
    public double getValor() {
        return valor;
    }
   
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
