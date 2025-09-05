package poo.aula15;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, genero, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase * Bonificacao.GERENTE.getValor();
    }

    @Override
    public String toString() {
        return "Gerente [" +
                "Nome = " + nome + '\'' +
                ", CPF = " + cpf + '\'' +
                ", Genero = " + genero.getGenero() +
                ", Salário Base = " + salarioBase +
                ", Data Nascimento = " + dataNascimento +
                ", Data Admissao =  " + dataAdmissao +
                ", Bonificação =  " + bonificacao.getValor() +
                ']';
    }
}
