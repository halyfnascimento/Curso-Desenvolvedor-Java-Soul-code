package Orientação_a_Objetos2;

import Orientação_a_Objetos2.Classes.Cachorro;

public class Interface {

    public static void main(String[] args){

        //Classes: Animal e Cachorro, Interface: Mamifero.
        Cachorro c1 = new Cachorro();

        c1.Andar();

        System.out.println(c1.passos);
    }
    
}
