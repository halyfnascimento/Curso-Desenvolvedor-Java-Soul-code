package Banco.Classes;

public class Conta {
    public String nome_cliente;
    public int numero_conta;
    public int saldo;


   public void depositar(int valor){
        int novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;
 }

    public void saca(int valor){
        int novoValor = this.saldo - valor;
        this.saldo = novoValor;
    }

    public void verificaSaldo(){
        System.out.println("Seu saldo é de R$:" + this.saldo);
    }

    public boolean verificaSaldo(int valor){
        if (this.saldo < valor){
            return false;
        }
        else{
            return true;
        }
    }
}

