package entradaDadosScanner;

import java.util.Scanner;

public class CalculandoNotasDeAluno {
    public static void main(String[] args) {
        Scanner recebeNotaAlunos = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        //Recebendo dados do usuário
        System.out.println("Digite a primeira nota: ");
        nota1 = recebeNotaAlunos.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = recebeNotaAlunos.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = recebeNotaAlunos.nextDouble();
        System.out.println("Digite a quarta nota:");
        nota4 = recebeNotaAlunos.nextDouble();

//Processando dados recebidos
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String resultado = String.format("%.2f", media);

        if (media >= 8 && media <= 10) {
            System.out.println("Você foi aprovado com sucesso!✌✌ sua nota foi: " + resultado);
        } else if (media >= 6 && media < 8) {
            System.out.println("Você foi aprovado! sua nota foi: " + resultado);
        } else if (media >= 0 && media < 6) {
            System.out.println("Que pena você ficou de recuperação! 😒😒 sua nota foi: " + resultado);
        } else {
            System.out.println("Erro! Só validamos as notas de 0 à 10.");
        }
recebeNotaAlunos.close();    }
}

