/*
    Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
    Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
    Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias: ");
        int diasTotais = input.nextInt();

        int quantAnos = diasTotais / 365;
        int diasRestantes = diasTotais % 365;
        int quantMeses = diasRestantes / 30;
        int dias = diasRestantes % 30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", quantAnos, quantMeses, dias);

    }
}
