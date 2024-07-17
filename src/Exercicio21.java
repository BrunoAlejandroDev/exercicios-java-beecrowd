/*
    Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
    A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
    As notas consideradas são de 100, 50, 20, 10, 5, 2.
    As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
    A seguir mostre a relação de notas necessárias.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.getDefault());
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor: ");
        double valorOriginal = input.nextDouble();
        int valorInteiro = (int) valorOriginal;
        double parteDecimal = valorOriginal - valorInteiro;

        int[] arrayCedulas = {100, 50, 20, 10, 5, 2};
        double[] arrayMoedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        int[] quantCedulas = new int[arrayCedulas.length];
        int[] quantMoedas = new int[arrayMoedas.length];

    }
}
