package poo.aula15;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, Genero genero, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, genero, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratado!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitido!");
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase  * Bonificacao.DIRETOR.getValor();
    }

    @Override
    public String toString() {
        return "Diretor [" +
                "Nome = " + nome + '\'' +
                ", CPF = " + cpf + '\'' +
                ", Genero = " + genero.getGenero() +
                ", Salário Base = " + salarioBase +
                ", Data Nascimento = " + dataNascimento +
                ", Data Admissao = " + dataAdmissao +
                ", Bonificação = " + bonificacao.getValor() +
                ", Premio = " + PREMIO +
                ']';
    }
}
