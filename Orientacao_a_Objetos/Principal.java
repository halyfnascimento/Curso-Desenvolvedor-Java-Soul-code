package Orientacao_a_Objetos;
import java.util.Scanner;

import Orientacao_a_Objetos.Classes.Animal;


public class Principal {
 
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
       
     //Objeto  
        Animal Cachorro;
        Cachorro = new Animal();

        Cachorro.idade = 7;
        Cachorro.Nome = "Nemo";
        Cachorro.Identificador = 2;
        Cachorro.Especie = "Canino";

        Animal a2;
        a2 = new Animal();

        a2.idade = 8;
        a2.Nome = "safira";

        

        System.out.println("Idade: " + Cachorro.idade + " Nome: " + Cachorro.Nome + ", Idade do Segundo Dog: " + a2.idade + " Nome do segundo Animal: " + a2.Nome);

        a2.modificaidade(16);
        System.out.println("A nova idade do animal é: " + a2.idade);
        /*Exemplos de Atributos;
         * .Nome
         * .Idade
         * .Especie
         * .Identificador
         */

         System.out.println();

        teclado.close();
    }
    
}
