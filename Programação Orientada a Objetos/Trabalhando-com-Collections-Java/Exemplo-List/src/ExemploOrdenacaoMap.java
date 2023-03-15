import java.util.*;

/*
Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória-\t--");
        //Imprimir autor e nome, não imprimir número de páginas por enquanto.
        Map<String, Livros> meuslivros = new HashMap<String, Livros>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livros> livros : meuslivros.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção-\t--");
        Map<String, Livros> meuslivros1 = new LinkedHashMap<String, Livros>(){{
            put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livros("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livros> livros : meuslivros1.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética Autores-\t--");
        Map<String, Livros> meusLivros2 = new TreeMap<String, Livros>(meuslivros1);
        for (Map.Entry<String, Livros> livros : meusLivros2.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética Nomes dos Livros-\t--");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meuslivros.entrySet());
        for (Map.Entry<String, Livros> livros : meusLivros3) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
        }


        //System.out.println("--\tOrdem Número de Páginas-\t--");



    }
}

/*
* Passo 1 - criar a classe Livro
* Passo 2 - criar as variaveis nome e paginas
* Passo 3 - criar o construtor
* Passo 4 - criar o getter
* Passo 5 - sobrescrever os métodos equals e hashCode.
* Passo 6 - sobrescrever o método toString
* */
class Livros {
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}