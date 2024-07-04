/*
    Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno,
    sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/

// ao utilizar notas com peso, primeiro realiza-se o produto entre as notas e os pesos respectivos, e divide o resultado pela soma dos pesos.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double A = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double B = input.nextDouble();

        double media = (A * 3.5 + B * 7.5) / 11;

        System.out.println("MEDIA = " + String.format("%.5f", media));

        input.close();

    }
}