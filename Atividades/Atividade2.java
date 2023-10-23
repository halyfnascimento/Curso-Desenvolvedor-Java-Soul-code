package Atividades;
import Atividades.Classes.Colaborador;
import Atividades.Classes.Pessoa;

public class Atividade2 {

    public static void main(String[] args){
        Pessoa eu;
        eu = new Pessoa();

        eu.nome = "Kaleo";
        eu.altura = 185;
        eu.cor = "Pardo";
        eu.idade = 20;


        System.out.println("***********");

        Colaborador a1;
        a1 = new Colaborador();

        a1.nome ="Kaleo";
        a1.ID = 77526;
        a1.Setor = "Departamento de Desenvolvimento";
    }
    
}
