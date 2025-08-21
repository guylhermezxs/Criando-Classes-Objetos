package poo.aula2;

public class Pet {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentacao;

    public Pet(String nome, int idade, String raca, String porte, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "Pet [" +
                "Nome=" + nome + '\'' +
                ", Idade= " + idade +
                ", Raça= " + raca + '\'' +
                ", Porte= " + porte + '\'' +
                ", Alimentação= " + alimentacao + '\'' +
                ']';
    }
}
