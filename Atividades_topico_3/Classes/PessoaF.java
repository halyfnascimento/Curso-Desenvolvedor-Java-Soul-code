//Crie uma classe chamada pessoa que
// tenha os atributos nome e idade,
// crie também uma classe pfisica e pjuridica,
// as classes herdam os atributos da classe pessoa.
package Atividades_topico_3.Classes;

public class PessoaF extends Pessoa{
    public PessoaF(String pFnome, int pFidade){
        super(pFnome, pFidade);
    }
    public String cpf;

    public void setCpf(String valor){
        this.cpf = valor;
    }
    public String getCpf(){
        return cpf;
    }

    //Crie uma classe chamada pessoa que tenha os atributos nome e idade,
    //crie também uma classe pfisica e pjuridica, 
    //as classes herdam os atributos da classe pessoa, 
    //e também tenha o metodo com o mesmo nome e parametros
    //executando codigos diferentes 
    //pfisica metodo mostrarNome (mostra o nome e envia a msg de boas vindas)
    //pjuridica metodo mostrarNome (apenas mostra o nome que o usuário digitou)
    public void Resposta(){
        System.out.println("Seja bem Vindo " + getNome());
    }
}
