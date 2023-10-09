
// ------------------------------------------ CLASSE E SEUS ATRIBUTOS----------------------------------------------
public class Conta {
    private int numeroAge;
    private int numerocon;
    private double saldo;
    private String cliente;
    private double valor;
    private double saque;
    private double depos;
  
    //----------------------------------------------------------------------------------------------

    // -----------------------------------------METODO CONSTRUTOR------------------------------------
    public Conta(int numeroAge, int numerocon, double saldo, String cliente, double valor, double saque,double depos) {
        this.numeroAge = numeroAge;
        this.numerocon = numerocon;
        this.saldo = saldo;
        this.cliente = cliente;
        this.valor= valor;
        this.saque= saque;
        this.depos=depos;
    }
    //----------------------------------------------------------------------------------------------

    //------------------------------------GET E SET-----------------------------------------------
    public int getNumeroAge() {
        return numeroAge;
    }
    public int getNumerocon() {
        return numerocon;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
     public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
      public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }
    public double getDepos() {
        return depos;
    }
    public void setDepos(double depos) {
        this.depos = depos;
    }
    //-----------------------------------------------------------------------------

    //-------------------------METODOS-----------------------------------
    
}