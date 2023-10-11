
// ------------------------------------------ CLASSE E SEUS ATRIBUTOS----------------------------------------------
public class Conta {
    private String numeroAge= "0001";
    private static int qtdcon= 1;
    private final int numero;
    private double saldo;
    private Cliente cliente;

    
    // -----------------------------------------METODO CONSTRUTOR------------------------------------
    public Conta( Cliente cliente, int numero) {
        this.numero=++qtdcon;
        this.cliente = cliente;
        
    }
    

    // ------------------------------------GET E SET-----------------------------------------------
    public String getNumeroAge() {
        return numeroAge;
    }

    public int getqtdcon() {
        return qtdcon;
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
    public int getNumero() {
        return numero;
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