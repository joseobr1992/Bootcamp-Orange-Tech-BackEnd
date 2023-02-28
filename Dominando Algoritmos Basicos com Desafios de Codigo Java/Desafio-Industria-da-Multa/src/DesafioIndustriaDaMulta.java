import java.util.Scanner;
public class DesafioIndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a velocidade captada? ");
        int velocidadeAtual = leitor.nextInt();

        if (velocidadeAtual <= 60) {
            System.out.println("Nao foi multado");
        } else {
            System.out.println("Foi multado");
        }

    }
}