package Orientação_a_Objetos2.Classes;

public class Cachorro extends Animal implements Mamifero{

    @Override
    public void Comer() {
        // TODO Auto-generated method stub
        System.out.println("Cachorro comendo.");
    }

    @Override
    public void Andar() {
        // TODO Auto-generated method stub
        System.out.println("Mamifero Andando " + passos + " passos");
    }

    

   
    
}
