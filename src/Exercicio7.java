/*
    Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
    segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int A = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int B = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int C = input.nextInt();

        System.out.print("Digite o quarto valor: ");
        int D = input.nextInt();

        int diferenca = (A * B - C * D);
        System.out.println("DIFERENCA = " + diferenca);

    }
}
