/*
    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
    o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código da peça 1: ");
        int codigoP1 = input.nextInt();

        System.out.print("Digite o numero de peças 1: ");
        int quantP1 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorP1 = input.nextDouble();

        System.out.print("Digite o código da peça 2: ");
        int codigoP2 = input.nextInt();

        System.out.print("Digite o numero de peças 2: ");
        int quantP2 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorP2 = input.nextDouble();

        double total = (valorP1 * quantP1) + (valorP2 * quantP2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}
