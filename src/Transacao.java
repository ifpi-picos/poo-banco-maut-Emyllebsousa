//---------------------------------------CLASSE ---------------------
public class Transacao {
   
    private String dth;
    private double valor;
    private String descricao;
//-------------------------------------METODO-------------------------
public Transacao(String dth, Double valor, String descricao) {
        this.dth = dth;
        this.valor = valor;
        this.descricao = descricao;
        
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
    public String getdescricao() {
        return descricao;
    }
    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void Despositar(double valor, Conta conta ){
      double saldoAtual= conta.getSaldo();
      double novoSaldo = saldoAtual + valor;
      conta.setSaldo(novoSaldo);

}
    public void Sacar( double valor, Conta conta){
    double saldoAtual = conta.getSaldo();
    double novoSaldo= saldoAtual + valor;
     System.out.println(novoSaldo);
    }
   
    public void Versaldo(double saldo){
       System.out.println(saldo);

}

}
