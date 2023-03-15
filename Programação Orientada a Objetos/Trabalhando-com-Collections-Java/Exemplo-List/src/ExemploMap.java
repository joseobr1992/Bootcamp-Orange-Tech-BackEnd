import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*
     Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
     modelo = gol - consumo = 14,4km/l
     modelo = uno - consumo = 15,6 km/l
     modelo = mobi - consumo = 16,1 km/l
     modelo = hb20 - consumo = 14,5 km/l
     modelo = kwid - consumo = 15,6 km/l
         */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println("---------------------------------------");

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);
        System.out.println("---------------------------------------");

        System.out.println("Confira se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("tucson"));
        System.out.println("---------------------------------------");

        System.out.println("Exiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("uno"));
        System.out.println("---------------------------------------");

        System.out.println("Exiba o terceiro modelo adicionado");
        System.out.println("No Map não há um método para fazer isso.");
        System.out.println("---------------------------------------");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("---------------------------------------");

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("---------------------------------------");

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        /*
        Passo 1 - Pega a lista de todos os valores do HashMap e encontra o maior deles e guarda na
        variavel consumoMaisEficiente.
         */
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        /*
        * Pega a coleção(sem itens repetidos) de entradas do mapa e armazena na variavel entries
        * */
        String modeloMaisEficiente = "";
        /*
        Cria uma string vazia, essa string irá armazenar o resultado do modelo de carro mais
        eficiente
         */
        for (Map.Entry<String, Double> entry: entries) {
            /*
            Loop que irá percorrer as entradas do mapa para pesquisar o modelo mais eficiente
             */
            if (entry.getValue().equals(consumoMaisEficiente)) {
                /*
                Para cada entrada, recupera o valor da entrada do mapa e compara com o valor
                do consumo mais eficiente de todo o mapa encontrado na linha 53

                 */
                modeloMaisEficiente = entry.getKey();
                /*
                * Retorna a chave encontrada da entrada mais eficiente
                * */
                System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("---------------------------------------");

        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = ""; //variavel só pra controle
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet() ) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " " + consumoMenosEficiente);
            }
        }
        System.out.println("---------------------------------------");

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("---------------------------------------");

        System.out.println("Exiba a média dos consumos deste dicionário: ");
        System.out.println(soma/carrosPopulares.size());
        System.out.println("---------------------------------------");

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println("---------------------------------------");

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println("---------------------------------------");

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<String, Double>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("---------------------------------------");

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println("---------------------------------------");

        System.out.println("confira se o dicionário está vazia: ");
        System.out.println(carrosPopulares.isEmpty());
        System.out.println("---------------------------------------");



    }
}
