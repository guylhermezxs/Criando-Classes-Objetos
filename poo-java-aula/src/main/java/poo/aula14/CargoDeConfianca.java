package poo.aula14;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonficacao;

    public CargoDeConfianca(String nome, String cpf, String dataNascimneto, double salarioBase, Bonificacao bonficacao) {
        super(nome, cpf, dataNascimneto, salarioBase);
        this.bonficacao = bonficacao;
    }

    public Bonificacao getBonficacao() {
        return bonficacao;
    }

    public void setBonficacao(Bonificacao bonficacao) {
        this.bonficacao = bonficacao;
    }
}
