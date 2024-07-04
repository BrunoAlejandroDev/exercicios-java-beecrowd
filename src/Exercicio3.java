/*
    Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int A = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int B = input.nextInt();

        int soma = A + B;

        System.out.println("Soma = " + soma);

        input.close();
    }
}