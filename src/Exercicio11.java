/*
    Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
    A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
    Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
    assumem que o resultado da divisão entre dois inteiros é outro inteiro.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor do raio: ");
        double raio = input.nextDouble();

        System.out.printf("Volume da esfera: %.3f%n", calcularVolume(raio));

    }

    public static double calcularVolume(double raio) {
        final double PI = 3.14159;
        return (4.0/3.0) * PI * Math.pow(raio, 3);
    }
}
