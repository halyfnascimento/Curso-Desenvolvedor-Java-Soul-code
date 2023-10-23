package Orientação_a_Objetos2.Classes;

public class Veiculo extends Transporte {

    public void andar(){
        System.out.println("Veiculo Andando");
    }
    public void andar(int qtdkm){
        System.out.println("Veiculo andando a " + qtdkm + " km/h");

    }

    public void andar(int qtdkm, int valor){
        System.out.println("Veiculo andando a " + qtdkm + " km/h, e fazendo " + valor +" km por litro");

    }
}
