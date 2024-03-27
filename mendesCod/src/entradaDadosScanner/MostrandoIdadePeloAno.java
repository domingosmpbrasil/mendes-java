package entradaDadosScanner;

import java.time.LocalDate;
import java.util.Scanner;

public class MostrandoIdadePeloAno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int anoAtual = LocalDate.now().getYear();
        int resultado;

        System.out.println("Digite sua idade: " );
        idade = entrada.nextInt();

        resultado = anoAtual - idade;

        System.out.println("Você nasceu no ano: " + resultado);
    }
}
