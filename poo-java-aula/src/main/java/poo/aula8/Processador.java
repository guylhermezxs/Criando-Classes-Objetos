package poo.aula8;

public class Processador extends Especificacao {
    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador [" +
                "Marca = " + marca + '\'' +
                ", Modelo = " + modelo + '\'' +
                ", Frequencia = " + frequencia + '\'' +
                ']';
    }
}
