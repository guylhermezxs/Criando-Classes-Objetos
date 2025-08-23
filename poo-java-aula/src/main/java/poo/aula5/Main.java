package poo.aula5;

import poo.aula4.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

        int opcao;
        int opcaoSetor, opcaoSexo;

        do{
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
                        System.out.println("Informe o Id do Funcionário:");
                        int id = sc.nextInt();
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

                        if (opcaoSetor == 1){
                            setor = Setor.FINANCEIRO;
                        } else if (opcaoSetor == 2) {
                            setor = Setor.RECURSOS_HUMANOS;
                        } else if (opcaoSetor == 3) {
                            setor = Setor.VENDAS;
                        } else if (opcaoSetor == 4) {
                            setor = Setor.MARKETING;
                        } else {
                            System.out.println("Valor invalido!");
                        }

                        System.out.println("Sexo:");
                        System.out.println("1 | Masculino");
                        System.out.println("2 | Feminino");
                        System.out.println("Informe a abaixo:");
                        opcaoSexo = sc.nextInt();

                        Sexo sexo;

                        if (opcaoSetor == 1){
                            sexo = Sexo.MASCULINO;
                        } else if (opcaoSetor == 2) {
                            sexo = Sexo.FEMININO;
                        } else {
                            System.out.println("Valor invalido!");
                        }

                        Funcionario funcionario = new Funcionario(id,nome,salario, setor , sexo);
                    }
            }

        }while(opcao != 3);
    }
}
