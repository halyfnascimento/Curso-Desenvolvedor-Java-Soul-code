//Crie uma classe que contenha atributos encapsulados, 
//os mesmos devem ser chamados na classe main,
//para isso você deve criar os gets e sets.
package Atividades_Topico_2.Classes;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String valor){
        this.nome = valor;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int valor){
        this.idade = valor;
    }
}
