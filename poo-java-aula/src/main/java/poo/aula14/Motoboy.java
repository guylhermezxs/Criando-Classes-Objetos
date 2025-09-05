package poo.aula14;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy [" +
                "Nome = " + nome + '\'' +
                ", CPF = " + cpf + '\'' +
                ", Data Nascimento = " + dataNascimento + '\'' +
                ", Salário Base = " + salarioBase +
                ", Placa Da Moto = " + placaDaMoto + '\'' +
                ']';
    }
}
