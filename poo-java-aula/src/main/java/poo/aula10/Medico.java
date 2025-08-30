package poo.aula10;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String email, double salario, Endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico [" +
                "Nome = " + nome + '\'' +
                ", Email = " + email + '\'' +
                ", Salario = " + salario +
                ", Endereço = " + endereco +
                ", CRM = " + crm + '\'' +
                ']';
    }
}
