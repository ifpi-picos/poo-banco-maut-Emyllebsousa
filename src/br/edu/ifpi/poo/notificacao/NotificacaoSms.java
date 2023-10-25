package br.edu.ifpi.poo.notificacao;
public class NotificacaoSms implements Notificacao {
//-------------------------------------------------------------------------------------------------------------------
    @Override
    public void enviaNotificacao(String tipo, double valor) {
        
        System.out.println("enviando notificacao por Sms, o/a " + tipo + "foi realizada , no valor de: " + valor);

    }
//----------------------------------------------------------------------------------------------------------------------
}
