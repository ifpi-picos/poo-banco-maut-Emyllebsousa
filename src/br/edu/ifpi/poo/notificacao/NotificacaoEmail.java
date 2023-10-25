package br.edu.ifpi.poo.notificacao;
public class NotificacaoEmail implements Notificacao{
//---------------------------------------------------------------------------------------------------------------
    @Override
    public void enviaNotificacao(String tipo, double valor) {
       
        System.out.println("enviando notificacao por email, o/a " + tipo + "foi realizado , no valor de : " + valor);
    }
//------------------------------------------------------------------------------------------------------------------
}
