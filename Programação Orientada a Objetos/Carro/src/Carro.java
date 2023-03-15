public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor aqui
    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    //get e set tanque

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    int getCapacidadeTanque(int capacidadeTanque) {
        return capacidadeTanque;
    }

    //método do total para enchar o tanque.
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
