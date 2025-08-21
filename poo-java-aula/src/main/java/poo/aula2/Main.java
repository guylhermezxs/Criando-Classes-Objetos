package poo.aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pet> listaPets = new ArrayList<>();
        int opcao;

        int quantidadePet = 0;

        do {
            System.out.println("Menu: Pet");
            System.out.println("1 - Cadastrar Pet ["+ quantidadePet +"]");
            System.out.println("2 - Exibir Pets");
            System.out.println("3 - Exit");
            System.out.println("Informe abaixo:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantos pets deseja cadastrar?");
                    int numPets = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numPets; i++) {
                        System.out.println("Informe o Nome do Pet:");
                        String nome = sc.nextLine();
                        System.out.println("Informe a Idade do Pet:");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Informe a Raça do Pet:");
                        String raca = sc.nextLine();
                        System.out.println("Informe o Porte do Pet:");
                        String porte = sc.nextLine();
                        System.out.println("Informe a Alimentação do Pet:");
                        String alimentacao = sc.nextLine();
                        Pet animal = new Pet(nome, idade, raca, porte, alimentacao);
                        System.out.println();
                        listaPets.add(animal);
                        quantidadePet++;
                    }
                    break;
                case 2:
                    if (quantidadePet == 0){
                        System.out.println("Cadastre um pet para exibir as informações!");
                    } else {
                        for(Pet animal : listaPets){
                            System.out.println(animal);
                        }
                    }
                    break;
                default:
                    System.out.println("Informe um número de 1 a 3");
            }
        } while (opcao != 3);


    }
}
