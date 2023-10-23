//Desenvolva uma classe que contenha 2(dois) construtores, 
//o primeiro deve mostrar uma mensagem que você desejar
// e a outra deve receber dois 
//parâmetros (int n1 e int n2) faça o cálculo e retorne o 
//resultado para o usuário.
package Atividades_Topico_2;

import Atividades_Topico_2.Classes.DoisConstrutor;

public class Atividade3 {
 public static void main(String[] args){
    DoisConstrutor c1 = new DoisConstrutor(12, 14);
    System.out.println("Este é o Segundo resultado:" + c1.soma);
    
 }   
}
