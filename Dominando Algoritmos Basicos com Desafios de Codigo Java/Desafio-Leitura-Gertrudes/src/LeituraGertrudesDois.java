import java.util.Scanner;
import java.math.MathContext;
public class LeituraGertrudesDois {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o numero de páginas");

        double paginas = leitor.nextInt();
        double dias = Math.ceil(paginas/3);
        int diasConvertidos = (int) dias;

        System.out.println(diasConvertidos + " dias");
    }
}
