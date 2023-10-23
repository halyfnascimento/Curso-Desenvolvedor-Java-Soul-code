package Orientação_a_Objetos2;
import Orientação_a_Objetos2.Classes.*;
public class Polimorfismo {
    public static void main(String[] args){
        Transporte t = new Transporte();
        Veiculo v = new Veiculo();
        Carro c = new Carro();


        t.andar();
        c.andar();
        v.andar(85, 13);
    }
}
