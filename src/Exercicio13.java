/*
    Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = input.nextInt();

        System.out.println(procurarMaiorValor(valor1, valor2, valor3) + " eh o maior");

    }

    public static int procurarMaiorValor(int valor1, int valor2, int valor3) {
        int maiorValor = (valor1 + valor2 + Math.abs(valor1 - valor2)) / 2;
        if (maiorValor < valor3) {
            maiorValor = valor3;
        }
        return maiorValor;
    }
}
