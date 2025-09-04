package poo.aula14;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String dataNascimneto, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimneto;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimneto() {
        return dataNascimento;
    }

    public void setDataNascimneto(String dataNascimneto) {
        this.dataNascimento = dataNascimneto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                "Nome = " + nome + '\'' +
                ", CPF = " + cpf + '\'' +
                ", Data de Nascimneto = " + dataNascimento + '\'' +
                ", Salario Base = " + salarioBase +
                ']';
    }


}
