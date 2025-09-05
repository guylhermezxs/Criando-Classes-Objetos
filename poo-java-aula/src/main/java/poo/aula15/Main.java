package poo.aula15;

public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor("Rafael","778.444.345-67",Genero.MASCULINO,5600,"23/04/1979","23/03/2001",Bonificacao.DIRETOR);
        Motoboy motoboy = new Motoboy("Cezar","778.333.234-89",Genero.MASCULINO,2300,"12/11/2002","22/02/2022","ERT-7656");
        Gerente gerente = new Gerente("Letícia","755.233.124-76",Genero.FEMININO, 3500, "22/12/1998","22/08/2015",Bonificacao.GERENTE);


        System.out.println();
        System.out.println("O diretor: " + diretor);
        System.out.println("E a gerente: " + gerente);
        System.out.println("Contrataram o motoboy: " + motoboy);
        diretor.admitir(motoboy);
        System.out.println();
        System.out.println("[--------[TABELA SALÁRIO]-------]");
        System.out.printf("Salário do Motoboy: %.2f\n" ,motoboy.getSalarioFinal());
        System.out.printf("Salário do Gerente: %.2f\n" ,gerente.getSalarioFinal());
        System.out.printf("Salário do Diretor: %.2f\n" ,diretor.getSalarioFinal());
        System.out.println("[--------------------------------]");
    }
}
