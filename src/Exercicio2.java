/*
    A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
    - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o valor do raio: ");
        double raio = input.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);

        input.close();
    }

}
