//Crie uma classe chamada pessoa que
// tenha os atributos nome e idade,
// crie também uma classe pfisica e pjuridica,
// as classes herdam os atributos da classe pessoa.
package Atividades_topico_3.Classes;

public class PessoaJ extends PessoaF{

public PessoaJ(String pJnome, int pJidade){
    super(pJnome, pJidade);
}
public String cnpj;

public void setCnpj(String valor){
    this.cnpj = valor;
}

public String getCnpj() {
    return cnpj;
}

//Crie uma classe chamada pessoa que tenha os atributos nome e idade,
    //crie também uma classe pfisica e pjuridica, 
    //as classes herdam os atributos da classe pessoa, 
    //e também tenha o metodo com o mesmo nome e parametros
    //executando codigos diferentes 
    //pfisica metodo mostrarNome (mostra o nome e envia a msg de boas vindas)
    //pjuridica metodo mostrarNome (apenas mostra o nome que o usuário digitou)

    public void Resposta(){
        System.out.println(getNome());
    }
}
