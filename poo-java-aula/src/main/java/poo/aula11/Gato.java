package poo.aula11;

public class Gato implements Animal {

    public Gato() {
    }

    @Override
    public String comer() {
        return "Ração Golden";
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }
}
