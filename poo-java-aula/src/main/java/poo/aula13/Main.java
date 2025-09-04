package poo.aula13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Diretor diretor = new Diretor("Leonardo","23/09/2001",Sexo.MASCULINO,Setor.FINANCEIRO,4500);
        Motoboy motoboy = new Motoboy("João","17/04/1999",Sexo.MASCULINO,Setor.OPERACOES,1500,"57228305689");

        System.out.println("Motoboy: " + motoboy);
        diretor.admitir(motoboy);
        System.out.println("Pelo diretor: " + diretor);
    }
}
