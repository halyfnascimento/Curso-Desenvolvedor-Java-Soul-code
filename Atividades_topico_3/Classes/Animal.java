//Crie uma classe animal em que tenha um método 
//que receba como parâmetro o nome do animal e sua idade, 
//crie também um método com o mesmo nome recebendo 
//atributos diferentes criando assim uma sobrecarga de métodos.
package Atividades_topico_3.Classes;

public class Animal {
    
    public Animal(String nome, int idade){
        System.out.println("O nome do animal é:" + nome + " e sua idade é:" + idade);
    }

    public Animal(String nome, int idade, String raca){
        System.out.println("O nome do animal é:" + nome + " e sua idade é:" + idade + " e sua raça é: " + raca);
        
    }
}
