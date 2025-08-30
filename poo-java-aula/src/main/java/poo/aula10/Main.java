package poo.aula10;

public class Main {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua das Flores", 123, "Apto 45B", "12345-678", "São Paulo");
        Endereco end2 = new Endereco("Avenida Brasil", 987, "Bloco C", "87654-321", "Rio de Janeiro");

        Engenheiro engenheiro = new Engenheiro("Carlos Silva", "carlos.silva@empresa.com", 8500.00, end1, "CREA-SP 123456");
        Medico medico = new Medico("Dra. Ana Costa", "ana.costa@hospital.com", 13500.00, end2, "CRM-RJ 654321");

        System.out.println();
        System.out.println("Dados do engenheiro: " + engenheiro);
        System.out.println("Dados do medico: " + medico);

    }
}
