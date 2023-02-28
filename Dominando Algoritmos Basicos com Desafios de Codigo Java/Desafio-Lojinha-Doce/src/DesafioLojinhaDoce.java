import java.util.Scanner;
public class DesafioLojinhaDoce {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você quer quantos reais em doces? ");
        int doce = leitor.nextInt();
        int docesAleatorios = doce * 2;

        System.out.println("O cliente obteve " + docesAleatorios + " doces");


    }
}