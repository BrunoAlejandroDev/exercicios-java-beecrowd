/*
   Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
   e calcule a distância entre eles, mostrando 4 casas decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor para X1: ");
        double x1 = input.nextDouble();

        System.out.print("Digite o valor para Y1: ");
        double y1 = input.nextDouble();

        System.out.print("Digite o valor para X2: ");
        double x2 = input.nextDouble();

        System.out.print("Digite o valor para Y2: ");
        double y2 = input.nextDouble();

        System.out.printf("%.4f%n", calcularDistancia(x1, y1, x2, y2));

    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
    }
}
