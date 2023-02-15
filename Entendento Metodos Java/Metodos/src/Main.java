public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercitando calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(0);

        //Emprestimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //Quadrilatero
        Quadrilatero.area(3);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7,8,9);

        //Quadrilatero com retornos.
        double areaQuadrado = QuadrilateroComRetorno.area(3);
        System.out.println("Area do Quadrado " + areaQuadrado);

        double areaRetangulo = QuadrilateroComRetorno.area(5,5);
        System.out.println("Area dp retangulo " + areaRetangulo);

        double areaTrapezio = QuadrilateroComRetorno.area(7,8,9);
        System.out.println("Area do trapézio " + areaTrapezio);

    }
}