package poo.aula12;

public class Divisao implements OperacaoMatematica {

    public Divisao() {
    }

    @Override
    public double calcular(double a, double b) {
        return  a / b;
    }
}
