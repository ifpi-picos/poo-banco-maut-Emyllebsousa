//---------------------------------------CLASSE ---------------------
public class Transacao {
   
    private String dth;
    private double valor;
    private String tipo;
//-------------------------------------METODO-------------------------
public Transacao(String dth, Double valor, String tipo) {
        this.dth = dth;
        this.valor = valor;
        this.tipo = tipo;
        
    }
//-----------------------------------GET E SET-------------------------
     public String getDth() {
        return dth;
    }
    public void setDth(String dth) {
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

