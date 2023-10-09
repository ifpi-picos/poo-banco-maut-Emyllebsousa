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

}
