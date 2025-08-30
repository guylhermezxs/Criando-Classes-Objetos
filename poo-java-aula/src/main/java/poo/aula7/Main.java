package poo.aula7;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Leonardo",30,"24/06/2025","Pix");
        Funcionario funcionario = new Funcionario("Daniel",34,"2344","Admistrador",3500);

        System.out.println("Dados do cliente: " + cliente);
        System.out.println("Dados do funcionario: " + funcionario);
    }
}
