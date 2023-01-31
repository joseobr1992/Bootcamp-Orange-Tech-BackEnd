import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quatNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quatNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
                else quantImpares++;

            count++;
        } while (count < quatNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);

    }
}