package Encapsulamento;

public class ObjetoContaBancaria {
    public static void main (String[] args){
        ContaBancaria conta = new ContaBancaria(10000.00);

        //saldo inicial
        System.out.println(conta.getSaldo());

        //Depósitos
        conta.depositor(500);
        conta.depositor(1000);

        //mostrar saldo após 2 depósitos
        System.out.println(conta.getSaldo());
        //Saque
        conta.sacar(1500);

        //mostrar após saque
        System.out.println(conta.getSaldo());
        }
}
