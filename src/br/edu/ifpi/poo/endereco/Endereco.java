package br.edu.ifpi.poo.endereco;
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private int numero;

    // -------------------------METODO CONSTRTOR--------------------------
    public Endereco(String rua, String bairro, String cidade, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    // ----------------------------GET E SET -----------------------------------
    public String getRua() {
        return rua;
    }
    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    
   
 @Override
public String toString(){
return "Endereço:/n"+ "Rua:"+rua + "-Nº"+numero + "Bairro: "+ bairro+ "Cidade"+ cidade; 
}
}
