
// ------------------------------------------ CLASSE E SEUS ATRIBUTOS----------------------------------------------
public class Conta {
    private int numeroAge;
    private int numerocon;
    private double saldo;
    private Cliente cliente;
    
    // -----------------------------------------METODO CONSTRUTOR------------------------------------
    public Conta(int numeroAge, int numerocon, double saldo, Cliente cliente ) {
        this.numeroAge = numeroAge;
        this.numerocon = numerocon;
        this.saldo = saldo;
        this.cliente = cliente;
        
    }
    

    // ------------------------------------GET E SET-----------------------------------------------
    public int getNumeroAge() {
        return numeroAge;
    }

    public int getNumerocon() {
        return numerocon;
    }

    public  double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

//---------------------------------------------------------------------------------------------------------------------

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
  public void Transfirir(double valor, String destino , Conta conta){
     double nvSaldo= conta.getSaldo();
     nvSaldo=nvSaldo-valor;
  
  
  
  }
}