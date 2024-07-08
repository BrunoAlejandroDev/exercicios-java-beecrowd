/*
    Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double A = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double B = input.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double C = input.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", triangulo(A, C));
        System.out.printf("CIRCULO: %.3f%n", circulo(C));
        System.out.printf("TRAPEZIO: %.3f%n", trapezio(A, B, C));
        System.out.printf("QUADRADO: %.3f%n", quadrado(B));
        System.out.printf("RETANGULO: %.3f%n", retangulo(A, B));

    }

    public static double triangulo(double A, double C) {
        return A * C / 2;
    }

    public static double circulo(double raio) {
        final double PI = 3.14159;
        return PI * Math.pow(raio, 2);
    }

    public static double trapezio(double A, double B, double C) {
        return (A + B) * C / 2;
    }

    public static double quadrado(double B) {
        return Math.pow(B, 2);
    }

    public static double retangulo(double A, double B) {
        return A * B;
    }
}