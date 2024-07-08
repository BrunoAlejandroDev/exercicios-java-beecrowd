/*
    Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância percorrida: ");
        int distancia = input.nextInt();

        System.out.print("Digite o total de combustível consumido: ");
        double combustivelGasto = input.nextDouble();

        System.out.printf("%.3f km/l%n", calcularConsumo(distancia, combustivelGasto));

    }

    public static double calcularConsumo(int distancia, double combustivelGasto) {
        return distancia / combustivelGasto;
    }
}
