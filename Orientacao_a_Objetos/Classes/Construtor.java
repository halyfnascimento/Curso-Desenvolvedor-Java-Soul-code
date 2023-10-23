package Orientacao_a_Objetos.Classes;

public class Construtor {
    
    private int numero;
    
    public Construtor(){
        System.out.println("Essa é uma msg do Constructor");
        }
        
        public Construtor(int v1, int v2){
            this.numero = v1 + v2;
        }

        public int getNumero(){
            return numero;
        }
}
