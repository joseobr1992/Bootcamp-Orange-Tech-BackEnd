package edu.jose.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA DE MINERVA");
        else 
            System.out.print("APROVADO COM SUCESSO");
    }
}
