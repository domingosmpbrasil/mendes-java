

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.saldo = 1000.0;
        conta1.agencia = 1001;
        conta1.numeroConta = 12345;
        conta1.nomeTitular = "João";
        System.out.println("Saldo: "+ conta1.saldo);
        System.out.println("Agencia: " + conta1.agencia);
        System.out.println("Número da conta: " + conta1.numeroConta);
        System.out.println("Titular:" + conta1.nomeTitular);


        Conta conta2 = new Conta();

        conta2.saldo = 10000.0;
        conta2.agencia = 1001;
        conta2.numeroConta = 12346;
        conta2.nomeTitular = "Maria";
        System.out.println("Saldo: "+ conta2.saldo);
        System.out.println("Agencia: " + conta2.agencia);
        System.out.println("Número da conta: " + conta2.numeroConta);
        System.out.println("Titular:" + conta2.nomeTitular);

        //conta 1 - João
        System.out.println("\n");
        conta1.depositar(100.00);
        conta1.extrato();

        // Conta 2 - Maria
        System.out.println("\n");
        conta2.sacar(4000.00);
        conta2.extrato();


    }
}