

public class App {
  public static void main(String[] args) throws Exception {

    Cliente a = new Cliente("Emylle","000", "00/00/0000", null);

    Conta c1 = new Conta(a, 0);
    Conta c2 = new Conta(a, 0);
    Conta c3 = new Conta(a, 0);

 
 
  c1.getSaldo();
  c2.getSaldo();
  c3.getSaldo();

  c1.Despositar(50);
}
}