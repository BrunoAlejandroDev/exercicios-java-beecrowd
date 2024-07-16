/*
    Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
    e informe-o expresso no formato horas:minutos:segundos.
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int totalSegundos = input.nextInt();

        int horas = totalSegundos / 3600; // descobrir quantas horas
        int segundosRestantes = totalSegundos % 3600; // pegar o valor de segundos restantes após descobrir as horas
        int minutos = segundosRestantes / 60; // descobrir os minutos
        int segundos = segundosRestantes % 60; // pegar o valor restante após descobrir o valor de minutos

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
