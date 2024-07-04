/*
    Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu salario fixo: ");
        double salarioFixo = input.nextDouble();

        System.out.print("Digite o total de vendas efetuadas: ");
        double vendasEfetuadas = input.nextDouble();

        double valorFinal = salarioFixo + (0.15 * vendasEfetuadas);

        System.out.printf("TOTAL = R$ %.2f%n", valorFinal);

    }
}
