package poo.aula12;

public class Soma implements OperacaoMatematica {

    public Soma() {
    }

    @Override
    public double calcular(double a, double b) {
        return  a + b;
    }
}
