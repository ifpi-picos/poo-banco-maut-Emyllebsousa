package br.edu.ifpi.poo.entidades;
import java.util.Scanner;

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

    public void Cadastro(Cliente cliente) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome=scan.nextLine();
        System.out.println("Digite seu cpf: ");
        this.cpf=scan.nextLine();
        System.out.println("Digite sua Data de nascimento: ");
        this.dtn=scan.nextLine();
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
