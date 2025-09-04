package poo.aula14;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataNascimneto, double salarioBase, Bonificacao bonficacao) {
        super(nome, cpf, dataNascimneto, salarioBase, bonficacao);
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
                ", Data Nascimneto = " + dataNascimento + '\'' +
                ", Salário Base ="  + salarioBase +
                ", Bonficação = " + bonficacao +
                ']';
    }
}
