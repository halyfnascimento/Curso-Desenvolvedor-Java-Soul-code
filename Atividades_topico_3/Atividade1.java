//Crie uma classe chamada pessoa que
// tenha os atributos nome e idade,
// crie também uma classe pfisica e pjuridica,
// as classes herdam os atributos da classe pessoa.
package Atividades_topico_3;
import Atividades_topico_3.Classes.*;

public class Atividade1 {
    
    public static void main(String[] args){
        PessoaF c1 = new PessoaF("Kaleo", 20);

        c1.cpf = "54555";

        System.out.println("O nome da Pessoa Fisica é:" + c1.getNome());
        System.out.println("A idade da Pessoa Fisica é:" + c1.getIdade());
        System.out.println("O Cpf da Pessoa Fisica é:" + c1.getCpf());



        System.out.println("-------------------------------------------");


        PessoaJ pj1 = new PessoaJ("halyf", 20);

        pj1.setCpf("55886");
        pj1.setCnpj("32456657777");
        System.out.println("O nome da Pessoa Juridica é:" + pj1.getNome());
        System.out.println("A idade da Pessoa Juridica é:" + pj1.getIdade());
        System.out.println("O Cpf da Pessoa Juridica é:" + pj1.getCpf());
        System.out.println("O Cnpj da Pessoa Juridica é" + pj1.getCnpj());


    }


}
