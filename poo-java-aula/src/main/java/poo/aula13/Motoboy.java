package poo.aula13;

public class Motoboy extends Funcionario {
    private String carteiraHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy [" +
                "Nome = " + nome + '\'' +
                ", Data Nascimento = " + dataNascimento + '\'' +
                ", Sexo = " + sexo.getSexo() +
                ", Setor = " + setor.getSetor() +
                ", Salario Base = " + salarioBase +
                ", Carteira Habilitação = " + carteiraHabilitacao + '\'' +
                ']';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
}
