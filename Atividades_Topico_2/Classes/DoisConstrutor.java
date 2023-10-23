//Desenvolva uma classe que contenha 2(dois) construtores, 
//o primeiro deve mostrar uma mensagem que você desejar
// e a outra deve receber dois 
//parâmetros (int n1 e int n2) faça o cálculo e retorne o 
//resultado para o usuário.
package Atividades_Topico_2.Classes;

public class DoisConstrutor {
    public int soma;


    public DoisConstrutor(){
        System.out.println("Esta é uma Msg Padrão");
    }

    public DoisConstrutor(int v1, int v2){
        this.soma = v1 + v2;
    }
}
