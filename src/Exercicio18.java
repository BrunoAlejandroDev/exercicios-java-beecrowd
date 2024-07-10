/*
    Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
    As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.getDefault());
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor: ");
        int valor = input.nextInt();
        int valorOriginal = valor;

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidade = new int[cedulas.length];

        for (int i = 0; i < cedulas.length; i++) {
            quantidade[i] = valor / cedulas[i]; // verificar quantas cedulas eu vou precisar, considerando cedulas[i]
            valor %= cedulas[i];
        }

        System.out.println(valorOriginal);
        for (int i = 0; i < cedulas.length; i++) {
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade[i], (double) cedulas[i]);
        }
    }
}