package poo.aula11;

public class Pato implements Animal{

    public Pato() {
    }

    @Override
    public String emitirSom() {
        return "Quack-Quack!";
    }

    @Override
    public String comer() {
        return "Ração Especializada";
    }
}
