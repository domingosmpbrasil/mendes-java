package classeScaner;

import java.util.Scanner;

public class MostrandoIdadePeloAno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int ano_atual = 2024;
        int rezultado;

        System.out.println("Digite sua idade: " );
        idade = entrada.nextInt();

        rezultado = ano_atual - idade;

        System.out.println("Você nasceu no ano: " + rezultado);
    }
}
