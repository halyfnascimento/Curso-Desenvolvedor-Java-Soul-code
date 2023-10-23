package Orientacao_a_Objetos;

import Orientacao_a_Objetos.Classes.Visibilidade;

public class Encapsulamento {
    public static void main(String[] args)
{

    Visibilidade visibilidade;
    visibilidade = new Visibilidade();

    visibilidade.setIdade(89);
    System.out.println("O valor da idade é igual á:" + visibilidade.getIdade());
    visibilidade.numero = 819927;

}    
}
