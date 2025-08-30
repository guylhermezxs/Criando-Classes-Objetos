package poo.aula8;

public class Memoria extends Especificacao {
    private String capacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeDeArmazenamento) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [" +
                "Marca = " + marca + '\'' +
                ", Modelo = " + modelo + '\'' +
                ", Capacidade De Armazenamento = " + capacidadeDeArmazenamento + '\'' +
                ']';
    }
}
