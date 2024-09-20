/*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
    Código 1: 4.00
    Código 2: 4.50
    Código 3: 5.00
    Código 4: 2.00
    Código 5: 1.50
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = input.nextInt();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = input.nextInt();

        System.out.printf("Total: R$ %.2f", calcularValor(codigo, quantidade));
    }

    public static double calcularValor(int id, int quantidade)
    {
        double valorTotal = 0;
        switch (id)
        {
            case 1:
                valorTotal = 4.0 * quantidade;
                break;
            case 2:
                valorTotal = 4.50 * quantidade;
                break;
            case 3:
                valorTotal = 5.0 * quantidade;
                break;
            case 4:
                valorTotal = 2.0 * quantidade;
                break;
            case 5:
                valorTotal = 1.50 * quantidade;
                break;
            default:
                System.out.println("Código incorreto.");
        }
        return valorTotal;
    }
}
