import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println(" ");

        System.out.println("Exiba a posição da nota 5.0 ");
        // Não tem como exibir a posição pois o método HashSet não tem index, não consigo usar o indexOf no HashSet
        System.out.println("Não tem como exibir a posição no HashSet ");

        System.out.println(" ");

        System.out.println("Adicione a nota 8.0 na posição 4: ");
        //Não consigo trabalhar com posição dentro do Set.
        System.out.println("Não consigo trabalhar com posição dentro do Set.");

        System.out.println(" ");

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        //Não tem como fazer isso, só se fosse uma list.
        System.out.println("Não tem como fazer isso, só se fosse uma list ");

        System.out.println(" ");

        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5.0));

        System.out.println(" ");

        System.out.println("Exiba a terceira nota adicionada: ");
        //Não tem o método get para passar o indice e retornar a nota.
        System.out.println("Não tem o método get para passar o indice e retornar a nota ");

        System.out.println(" ");

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println(" ");

        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println(" ");

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println(" ");

        System.out.println("Exiba a média das notas: ");
        System.out.println(soma/ notas.size());

        System.out.println(" ");

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println(" ");

        System.out.println("Remova a nota da posição 0");
        System.out.println("Não é possível saber a posição no Set");

        System.out.println(" ");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
                if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println(" ");

        System.out.println("Exiba todas as notas na ordem em que foram informadas. ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println(" ");

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println(" ");

        System.out.println("Apague todo o conjunto. ");
        notas.clear();

        System.out.println(" ");

        System.out.println("Confira se o conjunto está vazio. ");
        System.out.println(notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio. ");
        System.out.println(notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio. ");
        System.out.println(notas3.isEmpty());

    }
}
