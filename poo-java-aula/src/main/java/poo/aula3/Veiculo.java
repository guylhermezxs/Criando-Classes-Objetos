package poo.aula3;

public class Veiculo {
    private String placa;
    private String cor;
    private int numerosPassageiros;
    private int capacidadeTanque;
    private int velociadeMaxima;
    private int consumoMedio;

    public Veiculo(String placa, String cor, int numerosPassageiros, int capacidadeTanque, int velociadeMaxima, int consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numerosPassageiros = numerosPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velociadeMaxima = velociadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo [" +
                "Placa= " + placa + '\'' +
                ", Cor= " + cor + '\'' +
                ", Números de Passageiros=" + numerosPassageiros +
                ", Capacidade de Tanque=" + capacidadeTanque +
                ", Velociade Máxima=" + velociadeMaxima +
                ", Consumo Médio=" + consumoMedio +
                ']';
    }
}
