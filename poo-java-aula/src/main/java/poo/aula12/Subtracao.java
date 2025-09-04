package poo.aula12;

public class Subtracao implements OperacaoMatematica {

    public Subtracao() {
    }

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
