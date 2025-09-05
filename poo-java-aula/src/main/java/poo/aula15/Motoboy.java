package poo.aula15;

import java.time.LocalDate;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, Genero genero, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto) {
        super(nome, cpf, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy [" +
                "Nome = " + nome + '\'' +
                ", CPF = " + cpf + '\'' +
                ", Genero = " + genero.getGenero() +
                ", Salário Base = " + salarioBase +
                ", Data Nascimento = " + dataNascimento +
                ", Data Admissao = " + dataAdmissao +
                ", Placa Da Moto = " + placaDaMoto + '\'' +
                ']';
    }
}
