package Atividades;
import Atividades.Classes.Pessoa;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Pessoa eu;
        eu = new Pessoa();

        eu.nome = teclado.next();
        eu.idade = teclado.nextInt();

        System.out.println(eu.nome + " " + eu.idade);

        teclado.close();
    }
    
}
