package Orientacao_a_Objetos;

import Orientacao_a_Objetos.Classes.FuncionarioH;
public class Heranca{
    public static void main(String[] args){
        
        FuncionarioH f = new FuncionarioH("Kaleo", 20, "88854");
        f.salario = 3500;

        System.out.println("Nome do funcionario = "+ f.getNome());
        System.out.println("Cpf do Funcionario = "+ f.getCpf());
        System.out.println("Idade do Funcionario = "+ f.getIdade());
        System.out.println("O salario do Funcionario é = "+ f.salario);


    }

}
