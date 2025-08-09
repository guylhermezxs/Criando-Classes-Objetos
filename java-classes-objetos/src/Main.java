//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Guilherme", "MAT001", "77844467668","guilherme@gmail.com",17);
        Aluno aluno2 = new Aluno("Leonardo", "MAT002", "772333657669","leonardo@gmail.com",30);

        Curso curso1 = new Curso("Desenvolvimento de Sistema", "DS101", (int) 2000);
        Curso curso2 = new Curso("Analise de Dados","AD102", (int) 360);

        Matricula matricula1 = new Matricula(aluno1,curso1,3,2025,"MAT001","25-06-2024");
        Matricula matricula2 = new Matricula(aluno2,curso2,2,2025,"MAT002","22-02-2025");

        System.out.print("\n");
        System.out.println("=== Dados das Matrículas ===");
        matricula1.exibirInformacoes();
        System.out.println("---------------------------");
        System.out.print("\n");
        matricula2.exibirInformacoes();
        System.out.println("---------------------------");



    }
}