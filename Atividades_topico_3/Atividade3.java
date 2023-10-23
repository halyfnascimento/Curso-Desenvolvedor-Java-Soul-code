//Crie uma classe chamada pessoa que tenha os atributos nome e idade,
    //crie também uma classe pfisica e pjuridica, 
    //as classes herdam os atributos da classe pessoa, 
    //e também tenha o metodo com o mesmo nome e parametros
    //executando codigos diferentes 
    //pfisica metodo mostrarNome (mostra o nome e envia a msg de boas vindas)
    //pjuridica metodo mostrarNome (apenas mostra o nome que o usuário digitou)
package Atividades_topico_3;
import Atividades_topico_3.Classes.*;

public class Atividade3 {
    public static void main(String[] args){
        PessoaF a = new PessoaF("Kaleo", 20);

        a.Resposta();

        PessoaJ b = new PessoaJ("Kaleo", 20);
        b.Resposta();
    }
    
}
