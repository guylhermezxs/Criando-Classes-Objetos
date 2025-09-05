package poo.aula15;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, genero, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
