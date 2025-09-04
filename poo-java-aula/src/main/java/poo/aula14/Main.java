package poo.aula14;

public class Main {
    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy("Lucas","778.444.678.89","23/03/1992",2500,"ERT-7865");
        Gerente gerente = new Gerente("Daniel","776.445.675.87","14/05,1993",5500,Bonificacao.GERENTE);

        System.out.println();
        System.out.println("Motoboy: " + motoboy);
        gerente.admitir(motoboy);
        System.out.println("Foi contratado pelo gerente: " + gerente);

        double salarioMotoboy = motoboy.obterSalarioFinal();
        double salarioGerente = gerente.obterSalarioFinal();

        System.out.println("Salário do Motoboy: " + salarioMotoboy);
        System.out.println("Salário do Gerente: " + salarioGerente);
    }
}
