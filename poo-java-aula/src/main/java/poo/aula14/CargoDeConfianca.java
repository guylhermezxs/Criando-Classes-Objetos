package poo.aula14;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataNascimneto, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimneto, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
