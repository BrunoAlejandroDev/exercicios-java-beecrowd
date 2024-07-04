/*
    Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo.
    Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário,
    você receberá "Presentation Error".
*/

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int A = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        int B = input.nextInt();

        int X = A + B;
        System.out.println("O valor da soma é: " + X);

        input.close();

    }

}
