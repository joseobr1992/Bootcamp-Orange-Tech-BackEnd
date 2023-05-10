package Poo.DebuggingJava;
import java.util.Scanner;
//Se for int a divisao das notas será 5, foi necessário mudar para double para dar o resultado correto
// 5.5, foi inserido as novas 7, 6, 5 e 4.
// Se eu colocar letra ao invés de número terei uma exceção InputMismatchException
public class CalculadoraDeMedidas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila","Lucas","Bruna","Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.println("Media da turma %f: " + media);

    }

    static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno: alunos ) {
            System.out.println("Nota do aluno %s: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;

    }


}




