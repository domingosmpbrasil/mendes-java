package entradaDadosScanner;

import java.util.Objects;
import java.util.Scanner;

public class ProgramaQueSomaDoisNumeros {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = soma.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = soma.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("Igual a." + resultado);
        System.out.println("Quer fazer mais somas? Digite S para sim ou N para não. ");
        String resposta = soma.next();


        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Digite o primeiro número: ");
            numero1 = soma.nextInt();
            System.out.println("Digite o segundo número: ");
            numero2 = soma.nextInt();
            resultado = numero1 + numero2;
            System.out.println("Os números somados são iguais a " + resultado);

            System.out.println("Quer fazer mais somas? Digite S para sim ou N para não. ");
            resposta = soma.next();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
