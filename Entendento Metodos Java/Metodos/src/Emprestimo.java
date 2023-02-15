public class Emprestimo {
    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }
    public static double getTaxaDuasParcelas() {
        return 0.3d;
    }
    public static double getTaxaTresParcelas() {
        return 0.45d;
    }
    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {

            double valorFinal = valor + (valor + getDuasParcelas());
            System.out.println("Valor final com duas parcelas " + valorFinal);

        } else if (parcelas == 3) {

            double valorFinal = valor + (valor + getTaxaTresParcelas());
            System.out.println("Valor final com 3 parcelas " + valorFinal);

        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }


    }


}
