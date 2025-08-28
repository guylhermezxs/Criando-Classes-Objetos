package poo.aula6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0, opcaoSexo , opcaoUF;
        int quantidadeUsuarios = 0;

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        do{
            System.out.println('\n');
            System.out.println("Menu:");
            System.out.println("[---------------------]");
            System.out.println("1 | Cadastrar Usuario ["+ quantidadeUsuarios +"]");
            System.out.println("2 | Exibir Usuarios");
            System.out.println("3 | Exit");
            System.out.println("[---------------------]");
            System.out.println("Informe a abaixo:");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe quantos usuarios desejar cadastrar?");
                    int numUsuarios = sc.nextInt();

                    for(int i = 0; i < numUsuarios; i++){
                        System.out.println("Digite o ID do Funcionário");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite o nome do Usuário:");
                        String nome = sc.nextLine();
                        System.out.println("Digite a idade do Usuário");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite o número do Usuário:");
                        String telefone = sc.nextLine();
                        System.out.println("Digite o email do Usuário:");
                        String email = sc.nextLine();
                        System.out.println("Sexo: ");
                        System.out.println("1 | Masculino");
                        System.out.println("2 | Feminino");
                        System.out.println("Informe a abaixo:");
                        opcaoSexo = sc.nextInt();
                        sc.nextLine();

                        Sexo sexo = switch (opcaoSexo) {
                            case 1 -> Sexo.MASCULINO;
                            case 2 -> Sexo.FEMININO;
                            default -> {
                                System.out.println("Opção inválida! Usando MASCULINO como padrão.");
                                yield Sexo.MASCULINO;
                            }
                        };

                        System.out.println("Endereço:");
                        System.out.println("Digite o Logradouro:");
                        String logradouro = sc.nextLine();
                        System.out.println("Digite o Número:");
                        String numero = sc.nextLine();
                        System.out.println("Digite o Complemento:");
                        String complemento = sc.nextLine();
                        System.out.println("Digite o CEP:");
                        String cep = sc.nextLine();
                        System.out.println("Digite a Cidade:");
                        String cidade = sc.nextLine();
                        System.out.println("Unidade Federativa: ");
                        System.out.println("1 | Bahia");
                        System.out.println("2 | São Paulo");
                        System.out.println("3 | Rio de Janeiro");
                        System.out.println("Informe a abaixo:");
                        opcaoUF = sc.nextInt();
                        sc.nextLine();

                        UnidadeFederativa unidadeFederativa = switch (opcaoUF) {
                            case 1 -> UnidadeFederativa.BAHIA;
                            case 2 -> UnidadeFederativa.SAO_PAULO;
                            case 3 -> UnidadeFederativa.RIO_DE_JANEIRO;
                            default -> {
                                System.out.println("Opção inválida! Usando MASCULINO como padrão.");
                                yield UnidadeFederativa.SAO_PAULO;
                            }
                        };

                        Endereco endereco = new Endereco(logradouro,numero,complemento,cep,cidade,unidadeFederativa);
                        Pessoa pessoa = new Pessoa(id,nome,idade,telefone,email,sexo,endereco);
                        quantidadeUsuarios++;
                        listaPessoas.add(pessoa);
                    }
                    break;
                case 2:
                    if (quantidadeUsuarios == 0){
                        System.out.println("Cadastre um usuario para exibir as informações!");
                    }

                    for (Pessoa pessoa : listaPessoas){
                        System.out.println(pessoa);
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Valor Invalido. Tente novamente!");
            }

        }while(opcao != 3);
    }
}
