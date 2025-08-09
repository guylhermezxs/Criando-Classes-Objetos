package moduloCliente;

public class Cliente {
    String nome;
    String email;
    String cpf;

    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoesCliente(){
        System.out.println("┌────────────────────────────┐");
        System.out.println("│      Dados do Cliente      │");
        System.out.println("└────────────────────────────┘");
        System.out.println("Nome do Cliente: " + getNome());
        System.out.println("Email do Cliente: " + getEmail());
        System.out.println("CPF: " + getCpf());
        System.out.println("------------------------------");
        System.out.print("\n");

    }
}
