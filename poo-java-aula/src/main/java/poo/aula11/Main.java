package poo.aula11;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println("Som do Cachorro: " + cachorro.emitirSom());
        System.out.println("Cachorro Come: " + cachorro.comer());
        System.out.println();
        System.out.println("Som do Gato: " + gato.emitirSom());
        System.out.println("Gato Come: " + gato.comer());
        System.out.println();
        System.out.println("Som do Galo: " + galo.emitirSom());
        System.out.println("Galo Come: " + galo.comer());
        System.out.println();
        System.out.println("Som do Pato: " + pato.emitirSom());
        System.out.println("Pato Come: " + pato.comer());


    }
}
