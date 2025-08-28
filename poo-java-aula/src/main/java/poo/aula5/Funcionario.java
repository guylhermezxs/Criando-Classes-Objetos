package poo.aula5;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private Setor setor;
    private Sexo sexo;

    public Funcionario(int id, String nome, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                "ID = " + id +
                ", Nome = " + nome + '\n' +
                ", Salario = " + salario +
                ", Setor = " + setor.getNome() +
                ", Sexo = " + sexo.getSexo() +
                ']';
    }
}
