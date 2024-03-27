package entradaDadosScanner;

import java.util.Scanner;

public class RecebendoDados1 {
    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        int idade;

        //Pergunta a idade e armazena

        System.out.println("Digite sua idade: ");
        idade = recebe.nextInt();
        System.out.printf("A sua idade é: " + idade + "Anos de vida!");

    }
}
