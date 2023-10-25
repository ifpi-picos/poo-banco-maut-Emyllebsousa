package br.edu.ifpi.poo.entidades;

import br.edu.ifpi.poo.notificacao.Notificacao;

public class Contacorrente extends Conta {
private double cheque=1000;
private double taxa= 0.1;
private double qtdTransferencias;

    public Contacorrente(String numero, String numeroag, Cliente cliente, Notificacao notificacao,double taxa) {
    super(numero, numeroag, cliente, notificacao);
    this.taxa = taxa;
    this.cheque= 1000;
    this.qtdTransferencias = 1;
}
// --------------------------------------------------------------------------------------------------------
public double getTaxa() {
    return taxa;
}

public double getCheque() {
    return cheque;
}
// ----------------------------------------------------------------------------------------------------------
   
    @Override
public void sacar(double valor) {
   if ( saldo + cheque >= valor){
    this.saldo-= valor;
//-------------------------------------------------------------------------------------------------------------
    this.notificacao.enviaNotificacao("Saque", valor);
    addHistoricoTransacao(valor, "saque");
//--------------------------------------------------------------------------------------------------------------

}else{
    System.out.println("VALOR INDISPONIVEL!");
   }
}
//---------------------------------------------------------------------------------------------------------------
@Override
public void transfere(double valor, Conta destino) {
   saldo -= valor;

   destino.saldo += valor;
//-----------------------------------------------------------------------------------------------------------------

if(qtdTransferencias>2){
    this.saldo-= valor+ (valor*taxa);
}
this.notificacao.enviaNotificacao("Transação", valor);
addHistoricoTransacao(valor, "Transação");
qtdTransferencias++;

    
}
//--------------------------------------------------------------------------------------------------------------
}

@Override
public void deposito(double valor) {
   
    if(valor>0){

    this.saldo+= valor;
//-------------------------------------------------------------------------------------------------------------
        this.notificacao.enviaNotificacao("deposito", valor);
        addHistoricoTransacao(valor, "deposito");
//----------------------------------------------------------------------------------------------------------------------
    }
}


}
