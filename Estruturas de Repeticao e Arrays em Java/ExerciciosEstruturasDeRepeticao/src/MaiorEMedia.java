import java.util.Scanner;
public class MaiorEMedia {
    /*
    Faça um programa que leia 5 números e informe o maior número e a média desses números.
    */
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = escreva.nextInt();

            soma = soma + numero;
            //System.out.println("Soma: " + soma);

            if (numero > maior) maior = numero;

            count++;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma)/5);

    }
}