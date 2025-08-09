package moduloProduto;

public class Produto {
    int idProduto;
    String nome;
    double preco;

    public Produto(int idProduto, String nome, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoesProduto(){
        System.out.println("┌────────────────────────────┐");
        System.out.println("│      Dados do Produto      │");
        System.out.println("└────────────────────────────┘");
        System.out.println("ID do produto: " + getIdProduto());
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço do produto: " + getPreco());
        System.out.println("-----------------------------");
    }
}
