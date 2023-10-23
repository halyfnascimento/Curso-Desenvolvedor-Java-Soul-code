package Orientacao_a_Objetos.Classes;




public class Animal {

     public String Nome;
     public int Identificador;
     public int idade;
     public String Especie;
     
    
    

    //metodo;
    public void modificaidade(int novaidade) {
        this.idade = novaidade;
    }

    public boolean verificarIdade(int Idade){
        if (Idade > 20){
            return true;
        }
        else{
        return false;
        }
    }
}
