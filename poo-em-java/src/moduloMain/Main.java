package moduloMain;

import moduloVendas.Vendedor;
import moduloVendas.SupervisorVendas;
import moduloCliente.Cliente;
import moduloProduto.Produto;
import moduloVendas.Venda;
import moduloVendas.FormaPagamento;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        Vendedor vendedor = null;
        SupervisorVendas supervisor = null;
        Cliente cliente = null;
        Produto produto = null;

        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        ArrayList<SupervisorVendas> listaSupervisores = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        ArrayList<Venda> listaVendas = new ArrayList<>();


        int numeroVendedores = 0;
        int numeroSupervisor = 0;
        int numeroCliente = 0;
        int numeroProduto = 0;
        int numeroVendas = 0;

        do {
            System.out.print("\n");
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Classes");
            System.out.println("2 - Exibir Informações");
            System.out.println("3 - Realizar Venda");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Menu: Cadastro");
                    System.out.println("1 - Cadastrar Vendedor [" + numeroVendedores + "]");
                    System.out.println("2 - Cadastrar Supervisor [" + numeroSupervisor + "]");
                    System.out.println("3 - Cadastrar Cliente [" + numeroCliente + "]");
                    System.out.println("4 - Cadastrar Produto [" + numeroProduto + "]");
                    System.out.println("Escolha o que deseja cadastrar:");
                    int subOpcao = sc.nextInt();
                    sc.nextLine();

                    switch (subOpcao) {
                        case 1:
                            System.out.println("Quantos vendedores deseja cadastar?:");
                            int numVendedores = sc.nextInt();
                            sc.nextLine();

                            for (int i = 0; i < numVendedores; i++) {
                                System.out.print("\n");
                                System.out.println("Vendedor: " + (i + 1));
                                System.out.println("┌────────────────────────────┐");
                                System.out.println("│      Dados do Vendedor     │");
                                System.out.println("└────────────────────────────┘");
                                System.out.println("Digite o nome do vendedor: ");
                                String nome = sc.nextLine();
                                System.out.println("Digite o salário do Vendedor: ");
                                double salario = sc.nextDouble();
                                sc.nextLine();
                                vendedor = new Vendedor(nome, salario);
                                listaVendedores.add(vendedor);
                                numeroVendedores++;
                            }
                            break;
                        case 2:
                            System.out.println("Quantos Supervisores deseja cadastar?:");
                            int numSupervisor = sc.nextInt();
                            sc.nextLine();

                            for (int i = 0; i < numSupervisor; i++) {
                                System.out.print("\n");
                                System.out.println("Supervisor: " + (i + 1));
                                System.out.println("┌────────────────────────────────────────┐");
                                System.out.println("│           Dados do Supervisor          │");
                                System.out.println("└────────────────────────────────────────┘");
                                System.out.println("Digite o nome do supervisor: ");
                                String nomeSupervisor = sc.nextLine();
                                System.out.println("Digite o salário do SupervisorVendas: ");
                                double salarioSupervisor = sc.nextDouble();
                                System.out.println("Digite a idade do SupervisorVendas");
                                int idadeSupervisor = sc.nextInt();
                                sc.nextLine();
                                supervisor = new SupervisorVendas(nomeSupervisor, salarioSupervisor, idadeSupervisor);
                                listaSupervisores.add(supervisor);
                                numeroSupervisor++;
                            }
                            break;
                        case 3:
                            System.out.println("Quantos Clientes deseja cadastar?:");
                            int numCliente = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < numCliente; i++) {
                                System.out.print("\n");
                                System.out.println("Cliente: " + (i + 1));
                                System.out.println("┌────────────────────────────┐");
                                System.out.println("│      Dados do Cliente      │");
                                System.out.println("└────────────────────────────┘");
                                System.out.println("Digite nome do cliente: ");
                                String nomeCliente = sc.nextLine();
                                System.out.println("Digite email do cliente:");
                                String emailCliente = sc.nextLine();
                                System.out.println("Digite o cpf do cliente:");
                                String cpfCliente = sc.nextLine();
                                cliente = new Cliente(nomeCliente, emailCliente, cpfCliente);
                                listaClientes.add(cliente);
                                numeroCliente++;
                            }
                            break;
                        case 4:
                            System.out.println("Quantos Produtos deseja cadastar?:");
                            int numProduto = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < numProduto; i++) {
                                System.out.print("\n");
                                System.out.println("Produto: " + (i + 1));
                                System.out.println("┌────────────────────────────┐");
                                System.out.println("│      Dados do Produto      │");
                                System.out.println("└────────────────────────────┘");
                                System.out.println("Digite ID do produto:");
                                int idProduto = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Digite nome do produto:");
                                String nomeProduto = sc.nextLine();
                                System.out.println("Digite o preço do produto:");
                                double precoProduto = sc.nextDouble();
                                sc.nextLine();
                                produto = new Produto(idProduto, nomeProduto, precoProduto);
                                listaProdutos.add(produto);
                                numeroProduto++;
                            }
                            break;
                        default:
                            System.out.println("Valor Invalido.");
                    }
                    break;
                case 2:
                    System.out.println("Menu: Informações");
                    System.out.println("1 - Informações dos Vendedores [" + numeroVendedores + "]");
                    System.out.println("2 - Informações dos Supervisores [" + numeroSupervisor + "]");
                    System.out.println("3 - Informações dos Clientes [" + numeroCliente + "]");
                    System.out.println("4 - Informações dos Produtos [" + numeroProduto + "]");
                    System.out.println("5 - Informações das Vendas [" + numeroVendas + "]");
                    System.out.println("Escolha quais informações deseja exibir: ");
                    int subOpcaoInfo = sc.nextInt();
                    sc.nextLine();

                    switch (subOpcaoInfo) {
                        case 1:
                            if (numeroVendedores == 0) {
                                System.out.println("Erro. É preciso cadastrar pelo menos um vendedor antes de exibir informações.");
                            } else {
                                for (int i = 0; i < listaVendedores.size(); i++) {
                                    vendedor = listaVendedores.get(i);
                                    vendedor.exibirInformacoesVendedor();
                                }
                            }
                            break;
                        case 2:
                            if (numeroSupervisor == 0) {
                                System.out.println("Erro. É preciso cadastrar pelo menos um supervisor antes de exibir informações.");
                            } else {
                                for (int i = 0; i < listaSupervisores.size(); i++) {
                                    supervisor = listaSupervisores.get(i);
                                    supervisor.exibirInformacoesSupervisor();
                                }
                            }
                            break;
                        case 3:
                            if (numeroCliente == 0) {
                                System.out.println("Erro. É preciso cadastrar pelo menos um cliente antes de exibir informações.");
                            } else {
                                for (int i = 0; i < listaClientes.size(); i++) {
                                    cliente = listaClientes.get(i);
                                    cliente.exibirInformacoesCliente();
                                }
                            }
                            break;
                        case 4:
                            if (numeroProduto == 0) {
                                System.out.println("Erro. É preciso cadastrar pelo menos um produto antes de exibir informações.");
                            } else {
                                for (int i = 0; i < listaProdutos.size(); i++) {
                                    produto = listaProdutos.get(i);
                                    produto.exibirInformacoesProduto();
                                }
                            }
                            break;
                        case 5:
                            if(numeroVendas == 0){
                                System.out.println("Nenhuma Venda Realizada.");
                            } else {
                                for (int i = 0; i < listaVendas.size(); i++){
                                   Venda venda = listaVendas.get(i);
                                   venda.exibirInformacoesVendas();
                                }
                            }
                            break;
                        default:
                            System.out.println("Valor Invalido.");
                    }
                    break;
                case 3:
                    if (numeroCliente == 0 || numeroProduto == 0 || numeroVendedores == 0) {
                        System.out.println("Você precisa cadastrar pelo menos 1 cliente, 1 vendedor e 1 produto para realizar uma venda.");
                        break;
                    }else{
                        System.out.println("Selecione o cliente:");
                        for (int i = 0; i < listaClientes.size(); i++) {
                            System.out.println((i + 1) + " - " + listaClientes.get(i).getNome());
                        }
                        int OpcaoCliente = sc.nextInt();
                        Cliente clienteVenda = listaClientes.get(OpcaoCliente - 1);


                        System.out.println("Selecione o vendedor:");
                        for (int i = 0; i < listaVendedores.size(); i++) {
                            System.out.println((i + 1) + " - " + listaVendedores.get(i).getNome());
                        }
                        int OpcaoVendedor = sc.nextInt();
                        Vendedor vendedorVenda = listaVendedores.get(OpcaoVendedor - 1);


                        ArrayList<Produto> produtosVenda = new ArrayList<>();
                        System.out.println("Quantos produtos deseja adicionar à venda?");
                        int qtdProdutos = sc.nextInt();
                        for (int i = 0; i < qtdProdutos; i++) {
                            System.out.println("Selecione o produto " + (i + 1) + ":");
                            for (int j = 0; j < listaProdutos.size(); j++) {
                                System.out.println((j + 1) + " - " + listaProdutos.get(j).getNome());
                            }
                            int OpcaoProdutoVenda = sc.nextInt();
                            produtosVenda.add(listaProdutos.get(OpcaoProdutoVenda - 1));
                        }
                        sc.nextLine();
                        System.out.println("Escolha a forma de pagamento:");
                        System.out.println("1 - Dinheiro");
                        System.out.println("2 - Cartão de Crédito");
                        System.out.println("3 - Cartão de Débito");
                        System.out.println("4 - PIX");
                        int opcaoPagamento = sc.nextInt();
                        sc.nextLine();

                        FormaPagamento formaPagamento;

                        switch (opcaoPagamento) {
                            case 1:
                                formaPagamento = FormaPagamento.DINHEIRO;
                                break;
                            case 2:
                                formaPagamento = FormaPagamento.CARTAO_CREDITO;
                                break;
                            case 3:
                                formaPagamento = FormaPagamento.CARTAO_DEBITO;
                                break;
                            case 4:
                                formaPagamento = FormaPagamento.PIX;
                                break;
                            default:
                                System.out.println("Opção inválida! Usando DINHEIRO como padrão.");
                                formaPagamento = FormaPagamento.DINHEIRO;
                                break;
                        }
                        Venda venda = new Venda(clienteVenda, vendedorVenda, produtosVenda, formaPagamento);
                        listaVendas.add(venda);
                        numeroVendas++;
                        System.out.println("Venda realizada com sucesso!");
                        break;
                    }
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        sc.close();
    }
}