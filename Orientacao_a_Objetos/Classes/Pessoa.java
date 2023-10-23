package Orientacao_a_Objetos.Classes;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String pNome, String pCpf, int pIdade){
        this.nome = pNome;
        this.idade = pIdade;
        this.cpf = pCpf;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    
}
