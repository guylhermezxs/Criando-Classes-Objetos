package poo.aula13;

public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor [" +
                "Nome = " + nome + '\'' +
                ", Data de Nascimento = " + dataNascimento + '\'' +
                ", Sexo = " + sexo.getSexo() +
                ", Setor = " + setor.getSetor() +
                ", Salario Base = " + salarioBase +
                ", Premio = " + PREMIO +
                ']';
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
        return super.salarioBase + (super.salarioBase * this.PREMIO);
    }


}
