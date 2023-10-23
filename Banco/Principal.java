package Banco;
import Banco.Classes.*;

public class Principal {
    
    public static void main(String[] args){
        Conta c1;
        c1 = new Conta();

        c1.nome_cliente = "Kaleo";
        c1.numero_conta = 454;
        c1.saldo = 0;

        System.out.println("----------------------------");
        System.out.println("Nome:" + c1.nome_cliente);
        System.out.println("Numero da conta:" + c1.numero_conta);
        System.out.println("Saldo:" + c1.saldo);


        c1.depositar(5000);



        System.out.println("----------------------------");
        System.out.println("Nome:" + c1.nome_cliente);
        System.out.println("Numero da conta:" + c1.numero_conta);
        System.out.println("Saldo:" + c1.saldo);

        c1.saca(1500);

        System.out.println("----------------------------");
        System.out.println("Nome:" + c1.nome_cliente);
        System.out.println("Numero da conta:" + c1.numero_conta);
        System.out.println("Saldo:" + c1.saldo);

    
        System.out.println("----------------------------");


        c1.verificaSaldo();


    }
}
