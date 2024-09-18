import java.util.Locale;
import java.util.Scanner;

public class Exercicio23
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double A = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double B = input.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double C = input.nextDouble();

        bhaskara(A, B, C);
    }

    public static void bhaskara(double A, double B, double C)
    {
        double delta = Math.pow(B, 2) - (4 * A * C);

        if (A == 0)
        {
            System.out.println("Impossivel calcular");
        }
        else if (delta < 0)
        {
            System.out.println("Impossivel calcular");
        }
        else
        {
            double bhaskaraPositivo = (-B + Math.sqrt(delta)) / (2 * A);
            double bhaskaraNegativo = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", bhaskaraPositivo);
            System.out.printf("R2 = %.5f%n", bhaskaraNegativo);
        }
    }
}