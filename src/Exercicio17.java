/*
    Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L.
    Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto
    na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida,
    calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo em horas: ");
        int tempo = input.nextInt();

        System.out.print("Digite a velocidade: ");
        int velocidade = input.nextInt();

        double litros = calcularQuantLitros(tempo, velocidade);

        System.out.println(litros);

    }

    public static double calcularQuantLitros(int tempo, int velocidade) {
        int quilometragem = 12;
        return (double) (tempo * velocidade) / quilometragem;
    }
}