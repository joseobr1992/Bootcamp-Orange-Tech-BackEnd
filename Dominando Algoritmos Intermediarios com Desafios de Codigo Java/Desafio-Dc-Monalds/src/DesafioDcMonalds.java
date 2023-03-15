import java.util.Scanner;
public class DesafioDcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        listaIngredientes = ingredientes.split(";");

        for (String lista : listaIngredientes ) {
            System.out.println(lista);
        }




    }
}
