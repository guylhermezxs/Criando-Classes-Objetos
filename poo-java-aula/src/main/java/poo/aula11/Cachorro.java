package poo.aula11;

public class Cachorro implements Animal {

    public Cachorro() {
    }

    @Override
    public String comer() {
        return "Ração Pedigree";
    }

    @Override
    public String emitirSom() {
        return "Auau!";
    }
}
