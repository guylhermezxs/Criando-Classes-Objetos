package poo.aula12;

public class Multiplicacao implements  OperacaoMatematica {

    public Multiplicacao() {
    }

    @Override
    public double calcular(double a, double b) {
        return  a * b;
    }
}
