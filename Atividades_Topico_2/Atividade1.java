//Crie uma classe que contenha atributos encapsulados,
//os mesmos devem ser chamados na classe main,
//para isso você deve criar os gets e sets.
package Atividades_Topico_2;

import Atividades_Topico_2.Classes.Pessoa;

public class Atividade1 {
    
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();

        p1.setNome("Kaleo");

        System.out.println("O Nome dado foi:" + p1.getNome());

        p1.setIdade(20);

        System.out.println("A idade dada foi:" + p1.getIdade());
    }

}
