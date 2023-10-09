import java.time.LocalDateTime;

public class Transação {
    LocalDateTime dth;
    Double valor;
    String tipo;
  public Transação(LocalDateTime dth, Double valor, String tipo) {
        this.dth = dth;
        this.valor = valor;
        this.tipo = tipo;
    
    }
    public void Sacar(Conta saldo, double valor){
        saque = saldo - valor;
     System.out.println(saque);
    }
    public void Despositar(double saldo,double valor , double depos){
       depos= saldo -valor;
        System.out.println(depos);
}
    public void Versaldo(double saldo){
       System.out.println(saldo);

}
}
