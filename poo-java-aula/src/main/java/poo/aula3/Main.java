package poo.aula3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> listaLivros = new ArrayList<>();
        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();

        int opcao;
        int quantidadeVeiculos = 0;
        int quantidadeLivros = 0;

        System.out.println();
        System.out.println("[----------------------]");
        System.out.println("Loja: Concessionária");
        System.out.println("1 | Cadastrar Veículo");
        System.out.println("2 | Exibir Veículos");
        System.out.println("[----------------------]");
        System.out.println();
        System.out.println("[----------------------]");
        System.out.println("Loja: Livraria");
        System.out.println("3 | Cadastrar Livro");
        System.out.println("4 | Exibir Livros");
        System.out.println("[----------------------]");
        System.out.println();
        System.out.println("[----------------------]");
        System.out.println("5 | Exit");
        System.out.println("[----------------------]");
        System.out.print("Informe:");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Quantos veículos deseja cadastrar?");
                int numVeiculos = sc.nextInt();

                for (int i = 0; i < numVeiculos; i++){
                    System.out.println("Informe a placa do veículo: ");
                    String placa = sc.nextLine();
                    System.out.println("Informe a cor do veículo:");
                    String cor = sc.nextLine();
                    System.out.println("Informe números de passageiros:");
                    int numerosPassageiros = sc.nextInt();
                    System.out.println("Informe a capacidade do tanque:");
                    int capacidadeTanque = sc.nextInt();
                    System.out.println("Informe a velocidade máxima:");
                    int velociadeMaxima = sc.nextInt();
                    System.out.println("Informe o consumo médio:");
                    int consumoMedio = sc.nextInt();

                    Veiculo veiculo = new Veiculo(placa,cor,numerosPassageiros,capacidadeTanque,velociadeMaxima,consumoMedio);
                    listaVeiculo.add(veiculo);
                    quantidadeVeiculos++;
                }
                break;
            case 2:
                if (quantidadeVeiculos == 0){
                    System.out.println("Cadastre um carro para exibir as informações!");
                } else {
                    for (Veiculo veiculo : listaVeiculo){
                        System.out.println(veiculo);
                    }
                }
            break;
            case 3:
                System.out.println("Quantos livros deseja cadastrar?");
                int numLivros = sc.nextInt();

                for(int i = 0; i < numLivros ; i++){
                    System.out.println("Informe o Titulo do Livro:");
                    String titulo = sc.nextLine();
                    System.out.println("Informe o Autor do Livro:");
                    String autor = sc.nextLine();
                    System.out.println("Informe Número Internacional Padronizado para Livro:");
                    String isbn = sc.nextLine();
                    System.out.println("Informe o Número de Paginas do Livro:");
                    int numerosPaginas = sc.nextInt();
                    System.out.println("Informe o Valor do Livro:");
                    double valorCompra = sc.nextDouble();

                    Livro livro = new Livro(titulo,autor,isbn,numerosPaginas,valorCompra);
                    listaLivros.add(livro);
                    quantidadeLivros++;
                }
                break;
            case 4:
                if(quantidadeLivros == 0){
                    System.out.println("Cadastre um livro para exibir as informações!");
                } else {
                    for (Livro livro : listaLivros){
                        System.out.println(livro);
                    }
                }
            break;
        }

    }
}
