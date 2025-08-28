package poo.aula5;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

        int opcao;
        int opcaoSetor, opcaoSexo;
        int quantidadeFuncionarios = 0;

        do{
            System.out.println("\n");
            System.out.println("Menu: ");
            System.out.println("1 | Cadastrar Funcionario");
            System.out.println("2 | Exibir Funcionarios");
            System.out.println("3 | Exit");
            System.out.println("Informe a abaixo:");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Quantos funcionarios deseja cadastrar?");
                    int numFuncionarios = sc.nextInt();

                    for(int i = 0 ; i < numFuncionarios; i++){
                        System.out.println("Informe o ID do Funcionário:");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Informe o Nome do Funcionário:");
                        String nome = sc.nextLine();
                        System.out.println("Informe o Salário do Funcionário:");
                        double salario = sc.nextDouble();
                        System.out.println("Setor:");
                        System.out.println("1 | Financeiro");
                        System.out.println("2 | Recursos Humanos");
                        System.out.println("3 | Vendas");
                        System.out.println("4 | Marketing");
                        System.out.println("Informe a abaixo");
                        opcaoSetor= sc.nextInt();

                        Setor setor;

                        switch (opcaoSetor){
                            case 1:
                                setor = Setor.FINANCEIRO;
                                break;
                            case 2:
                                setor = Setor.RECURSOS_HUMANOS;
                                break;
                            case 3:
                                setor = Setor.VENDAS;
                                break;
                            case 4:
                                setor = Setor.MARKETING;
                                break;
                            default:
                                System.out.println("Opção inválida! Usando FINACEIRO como padrão.");
                                setor = Setor.FINANCEIRO;
                                break;
                        }

                        System.out.println("Sexo:");
                        System.out.println("1 | Masculino");
                        System.out.println("2 | Feminino");
                        System.out.println("Informe a abaixo:");
                        opcaoSexo = sc.nextInt();

                        Sexo sexo;

                        switch (opcaoSexo){
                            case 1:
                                sexo = Sexo.MASCULINO;
                                break;
                            case 2:
                                sexo = Sexo.FEMININO;
                                break;
                            default:
                                System.out.println("Opção inválida! Usando MASCULINO como padrão.");
                                sexo = Sexo.MASCULINO;
                                break;
                        }

                        Funcionario funcionario = new Funcionario(id,nome,salario, setor , sexo);
                        listaFuncionario.add(funcionario);
                        quantidadeFuncionarios++;
                    }
                    break;
                case 2:
                    if (quantidadeFuncionarios == 0){
                        System.out.println("Cadastre um funcionário para exibir as informações!");
                    } else {
                        for ( Funcionario funcionario : listaFuncionario){
                            System.out.println(funcionario);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Valor Invalido. Tente novamente!");
            }

        } while(opcao != 3);
    }
}
