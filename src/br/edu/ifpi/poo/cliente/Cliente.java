package br.edu.ifpi.poo.cliente;

import br.edu.ifpi.poo.endereco.Endereco;

public class Cliente {

    private String nome;
    private String cpf;
    private String dtn;
    private Endereco endereco;

 
    public Cliente(String nome, String cpf, String dtn, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtn = dtn;
        this.endereco = endereco;
    }


    //-----------------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
     public String getDtn() {
        return dtn;
    }
        public Endereco getEndereco() {
        return endereco;
    }
}
