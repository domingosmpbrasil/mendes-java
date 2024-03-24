package classeScaner;

import java.util.Scanner;


public class CalculandoNotasDeAluno {
    public static void main(String[] args) {
        Scanner recebeNota = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
//Recebendo dados do usuário
        System.out.println("Digite a primeira nota: ");
        nota1 = recebeNota.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = recebeNota.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = recebeNota.nextDouble();
        System.out.println("Digite a quarta nota:");
        nota4 = recebeNota.nextDouble();

//Processando dados recebidos
        media = (nota1 + nota2 + nota3 + nota4) / 4;

    if (media >= 8 && media <= 10) {
        System.out.println("Você foi aprovado com sucesso!✌✌ Parabéns! ");
        }
    if (media >= 6 && media < 8) {
        System.out.println("Você foi aprovado! ");
    }
    if (media>=1 && media<6) {
        System.out.println("Que pena você ficou de recuperação! 😒😒 ");
    }
    else {
        System.out.println("entrada de Dados inválidos.. Só validamos a nota do aluno, de 1 a 10:  ");
    }
    }
    }
