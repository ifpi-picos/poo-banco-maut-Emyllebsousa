
// ------------------------------------------ CLASSE E SEUS ATRIBUTOS----------------------------------------------
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Conta {
    private String numeroAge= "0001";
    private static int qtdcon= 1;
    private final int numero;
    private double saldo;
    private Cliente cliente;
    private List <Transacao> transacao;
    
    // -----------------------------------------METODO CONSTRUTOR------------------------------------
    public Conta( Cliente cliente, int numero) {
        this.numero=++qtdcon;
        this.cliente = cliente;
        this.transacao= new ArrayList<>();
    }
    

    public Conta(int i, int j, int k, Cliente a) {
    }


    --------------------------------
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

    public void Despositar(double valor ){
      if(valor<=0){
      System.out.println("valor invalido");
      }else{
      this.saldo = this.saldo + valor;
      addHistoricoTransacao(valor, "deposito");
      }
  }
      public void Sacar( double valor, Conta conta){
      if(saldo<=0){
        System.out.println("Erro! Saldo indisponivel.");
      }else{
        this.saldo= this.saldo-valor;
        
      }

      }
      
    private void addHistoricoTransacao(double valor, String tipo){
        Transacao t = new Transacao(LocalDate.now(), valor, tipo);
        this.transacao.add(t);
    }
      public void Versaldo(double saldo){
        this.transacao.forEach(t -> System.out.println(t));
         System.out.println("Agencia: "+this.numeroAge);
         System.out.println("Conta: "+this.numero);
         System.out.println("Saldo: "+this.saldo);
    
  
  }
  public void Transfirir(double valor, String destino , Conta conta){
     double nvSaldo= conta.getSaldo();
     nvSaldo=nvSaldo-valor;
  
  }
 
}