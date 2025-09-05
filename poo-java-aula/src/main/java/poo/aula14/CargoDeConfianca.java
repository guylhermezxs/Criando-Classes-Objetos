package poo.aula14;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataNascimneto, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimneto, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonficacao() {
        return bonificacao;
    }

    public void setBonficacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
