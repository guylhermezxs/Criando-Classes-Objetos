package moduloVendas;

public class SupervisorVendas extends Vendedor {
    public int idade;

    public SupervisorVendas (String nome, double salario, int idade) {
        super (nome, salario);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void supervisionar () {
        System.out.println (nome + " está supervisionando os vendedores.");
    }

    public void vender (String produto) {
        System.out.println (nome + " (Supervisor) vender produto : " + produto + "com atendimento espcial.");
    }

    public void exibirInformacoesSupervisor(){
        System.out.println("┌────────────────────────────────────────┐");
        System.out.println("│           Dados do Supervisor          │");
        System.out.println("└────────────────────────────────────────┘");
        System.out.println("Nome Supervisor: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Idade: " + getIdade());
        System.out.println("------------------------------------------");
        System.out.print("\n");
    }
}
