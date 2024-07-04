/*
    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2,
    a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double A = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double B = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double C = input.nextDouble();

        double media = (A * 2 + B * 3 + C * 5) / 10;
        System.out.printf("MEDIA = %.1f", media);
    }
}
