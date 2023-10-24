package br.edu.ifpi.poo.cliente;

import java.util.Scanner;

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
public void Cadastro(Cliente cliente){
Scanner scanner = new Scanner(System.in);
System.out.println("Digite seu nome");
this.nome= scanner.nextLine();
System.out.println("Digite seu cpf");
this.cpf= scanner.nextLine();
System.out.println("Digite sua data de nascimento");
this.dtn= scanner.nextLine();

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
