/*
    Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu numero: ");
        int numeroFuncionario = input.nextInt();

        System.out.print("Digite seu numero de horas trabalhadas: ");
        int numeroHoras = input.nextInt();

        System.out.print("Digite o valor que recebe por horas: ");
        double valorPorHora = input.nextDouble();

        double salario = numeroHoras * valorPorHora;

        System.out.println("NUMBER: " + numeroFuncionario);
        System.out.printf("SALARY: U$ %.2f%n", salario);
        System.out.println();

    }
}
