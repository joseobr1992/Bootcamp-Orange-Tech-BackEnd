package Poo.TratamentoDeExcexoesJava;
import javax.swing.*;
//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {
         boolean continueLopping = true;
        do {
            //Para fazer o input dos numeradores e denominadores estaoms usando a classe JOptionPane e
            // o método showInputDialog, esse método retorna uma string
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                //Uso o parseInt para transformar a String e Inteiro
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado " + resultado);
                continueLopping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro " + e.getMessage());
                //throw new RuntimeException(e);
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Não é possível fazer divisão por 0 " + e.getMessage());
            } finally {
                System.out.println("Chegou no finaly!");
            }
        }while (continueLopping);

        System.out.println("O código continua...");
    }
    public static int dividir(int a, int b) {
        return a/b;
    }
}
