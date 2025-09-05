package poo.aula14;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
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
    public String toString() {
        return "Gerente [" +
                "Nome = " + nome + '\'' +
                ", CPF = " + cpf + '\'' +
                ", Data Nascimento = " + dataNascimento + '\'' +
                ", Salário Base ="  + salarioBase +
                ", Bonficação = " + bonificacao +
                ']';
    }
}
