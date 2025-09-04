package poo.aula12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        System.out.print("Digite o valor de A:");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B:");
        b = sc.nextDouble();

        System.out.println();

        System.out.println("[---------------------------]");
        System.out.println("Soma: ["+ a +" + "+ b +"] = " + soma.calcular(a,b));
        System.out.println("Subtração:["+ a + " - "+ b +"] = " + subtracao.calcular(a,b));
        System.out.println("Multiplicação: ["+ a +" x "+ b +"] =  " + multiplicacao.calcular(a,b) );
        System.out.println("Divisão: ["+ a +" / "+ b +"] = " + divisao.calcular(a,b));
        System.out.println("[----------------------------]");


    }
}
