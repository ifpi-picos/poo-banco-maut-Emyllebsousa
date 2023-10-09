
//-----------------------------CLASSE E SEUS ATRIBUTOS

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

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public int getNumero() {
        return numero;
    }

}
