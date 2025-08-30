package poo.aula10;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String nome, String email, double salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro [" +
                "Nome = " + nome + '\'' +
                ", Email = " + email + '\'' +
                ", Salario = " + salario +
                ", Endereço = " + endereco +
                ", CREA = " + crea + '\'' +
                ']';
    }
}
