//Crie uma classe chamada pessoa que
// tenha os atributos nome e idade,
// crie também uma classe pfisica e pjuridica,
// as classes herdam os atributos da classe pessoa.
package Atividades_topico_3.Classes;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String pNome, int pIdade){
        this.nome = pNome;
        this.idade = pIdade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    
}
