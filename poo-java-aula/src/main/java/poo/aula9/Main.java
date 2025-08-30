package poo.aula9;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("Enzo","71984224254","822.272.120-80","20.911.085-5","23/05/2001");
        Juridica juridica = new Juridica("Lorenzo","71984334356","79.056.219/0001-62","3224");

        System.out.println();
        System.out.println("Dados da pessoa fisica: " + fisica);
        System.out.println("Dados da pessoa juridica: " + juridica);
    }
}
