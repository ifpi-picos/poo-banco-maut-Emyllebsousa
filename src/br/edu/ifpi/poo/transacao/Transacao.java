package br.edu.ifpi.poo.transacao;

import java.time.LocalDate;

public class Transacao {
    public LocalDate data;
    public double valor;
    public String tipo;
     
  
    public Transacao(LocalDate data, double valor, String tipo) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
    }
//------------------------------------------------------------------------------------------------

@Override
   public String toString(){
return "Transação {" + "data =" + data 
+ "valor="+ valor + 
"tipo="+ tipo;
   }
    
}
