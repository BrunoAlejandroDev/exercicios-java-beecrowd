/*
    Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
    A seguir mostre a variável PROD com mensagem correspondente.
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primero valor: ");
        int valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = input.nextInt();

        int PROD = valor1 * valor2;

        System.out.println("PROD = " + PROD);
        input.close();

    }
}