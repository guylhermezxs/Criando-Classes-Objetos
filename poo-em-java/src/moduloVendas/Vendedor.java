package moduloVendas;

public class Vendedor {
    String nome;
    protected double salario;

    public Vendedor(String nome, double salario) {
        super();
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void exibirInformacoesVendedor(){
        System.out.println("┌────────────────────────────┐");
        System.out.println("│      Dados do Vendedor     │");
        System.out.println("└────────────────────────────┘");
        System.out.println("Nome Vendedor: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("-----------------------------");
        System.out.print("\n");
    }

}
