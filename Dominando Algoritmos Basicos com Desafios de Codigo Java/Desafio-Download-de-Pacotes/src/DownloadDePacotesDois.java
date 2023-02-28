import java.util.Scanner;
public class DownloadDePacotesDois {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Informe a porcentagem: ");

        int tamanho = leitor.nextInt();
        String barra = "";

        for (int num = 1; num <= tamanho; num++) {

            barra = barra.concat("/");

        }
        System.out.println(barra);
    }
}
