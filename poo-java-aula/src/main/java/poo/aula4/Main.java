package poo.aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        Endereco endereco1 = new Endereco("Rua A" , 24 , "Salvador");
        Endereco endereco2 = new Endereco("Rua B", 45 , "Rio de Janeiro");
        Endereco endereco3 = new Endereco("Rua C", 32, "Belo Horizonte");


        int opcao, opcaoEndereco;
        int quantCliente = 0;

        do {
            System.out.print("\n");
            System.out.println("Menu: ");
            System.out.println("1 | Cadastrar Cliente");
            System.out.println("2 | Exibir Usuarios");
            System.out.println("3 | Exit");
            System.out.println("Informe a abaixo:");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe quantos clientes deseja cadastrar?");
                    int numCliente = sc.nextInt();
                    sc.nextLine();

                    for(int i = 0; i < numCliente; i++){
                        System.out.println("Informe nome do cliente:");
                        String nome = sc.nextLine();
                        System.out.println("Informe idade do cliente:");
                        int idade = sc.nextInt();

                        System.out.println("Selecione o endereço:");
                        System.out.println("1 | Rua A | Número: 24 | Cidade: Salvador");
                        System.out.println("2 | Rua B | Número: 45 | Cidade: Rio de Janeiro");
                        System.out.println("3 | Rua C | Número: 32 | Cidade: Belo Horizonte");
                        System.out.println("Informe um endereço: ");
                        opcaoEndereco = sc.nextInt();

                        if (opcaoEndereco == 1){
                            Cliente cliente = new Cliente(nome,idade,endereco1);
                            listaCliente.add(cliente);
                        } else if (opcaoEndereco == 2) {
                            Cliente cliente =  new Cliente(nome,idade,endereco2);
                            listaCliente.add(cliente);
                        } else if (opcaoEndereco == 3) {
                            Cliente cliente = new Cliente(nome,idade,endereco3);
                            listaCliente.add(cliente);
                        } else {
                            System.out.println("Informe um número entre 1 a 3");
                        }

                    }
                    break;
                case 2:
                    if (quantCliente == 0){
                        System.out.println("Cadastre um cliente para exibir as informações!");
                    }else {
                        for (Cliente cliente : listaCliente){
                            System.out.println(cliente);
                        }
                    }
                break;
                case 3:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Informe um número entre 1 a 3");
            }

        } while(opcao != 3);

    }
}
