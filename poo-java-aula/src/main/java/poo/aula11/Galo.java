package poo.aula11;

public class Galo implements Animal {

    public Galo() {
    }

    @Override
    public String emitirSom() {
        return "Cocorico!";
    }

    @Override
    public String comer() {
        return "Ração Balanceada";
    }
}
