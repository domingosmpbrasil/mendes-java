public class Conta {
    double saldo;
    int agencia;
    int numeroConta;
    String nomeTitular;

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void extrato(){
        System.out.println("Saldo: "+ saldo);
        System.out.println("Agencia: " + agencia);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular:" + nomeTitular);
    }

}
