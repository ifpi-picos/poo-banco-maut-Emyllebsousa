//---------------------------------------CLASSE ---------------------

import java.time.LocalDate;

public class Transacao {
   
    private LocalDate dth;
    private double valor;
    private String tipo;
//-------------------------------------METODO-------------------------
public Transacao(LocalDate dth, Double valor, String tipo) {
        this.dth = dth;
        this.valor = valor;
        this.tipo = tipo;
        
    }
//-----------------------------------GET E SET-------------------------
     public LocalDate getDth() {
        return dth;
    }
    public void setDth(LocalDate dth) {
        this.dth = dth;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String gettipo() {
        return tipo;
    }
    public void settipo(String tipo) {
        this.tipo = tipo;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

