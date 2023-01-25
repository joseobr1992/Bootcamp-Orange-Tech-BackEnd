public class Operadores {
    public static void main(String[] args) {
        // concaternar com o operador aritimetico +
        String nomeCompleto = "LINGUAGEM " + "JAVA"; 
        System.out.println(nomeCompleto);

        //Teste depuração variável concatenacao
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
            System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
            System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
            System.out.println(concatenacao);

        //Unários
        int numero = -5;
            System.out.println(numero);
        numero = numero * -1;
            System.out.println(numero);

        //incremento e decremento
        int num = 5;
            System.out.println(num);
        ++num;
            System.out.println(num);

        //Operador Ternário
        int a, b;
        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        /*
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);
        */
        
        //Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        String nomeUm = "José";
        String nomeDois = "José";
        System.out.println(nomeUm.equals(nomeDois));

        //Lógicos
        boolean condicao1=true;
        boolean condicao2=true;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        
    }
}
