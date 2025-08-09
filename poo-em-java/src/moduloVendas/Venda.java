package moduloVendas;

import moduloCliente.Cliente;
import moduloProduto.Produto;
import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Produto> produtos;
    private FormaPagamento formaPagamento;

    public Venda(Cliente cliente, Vendedor vendedor, ArrayList<Produto> produtos, FormaPagamento formaPagamento) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produtos = produtos;
        this.formaPagamento = formaPagamento;
    }

    public void exibirInformacoesVendas() {
        System.out.println("┌────────────────────────────┐");
        System.out.println("│      Dados da Venda        │");
        System.out.println("└────────────────────────────┘");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Produtos:");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println((i + 1) + " - " + produto.getNome() + " | R$ " + produto.getPreco());
        }
    }
}
