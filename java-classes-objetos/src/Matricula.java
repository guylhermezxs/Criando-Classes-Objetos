public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private int semestre;
    private int ano;
    private String numeroMatricula;
    private String dataMatricula;

    public Matricula(Aluno aluno, Curso curso, int semestre, int ano, String numeroMatricula, String dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.semestre = semestre;
        this.ano = ano;
        this.numeroMatricula = numeroMatricula;
        this.dataMatricula = dataMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void exibirInformacoes() {
        System.out.println("Matrícula: " + numeroMatricula + ", Data: " + dataMatricula);
        System.out.println("Aluno matriculado:");
        aluno.exibirInformacoes();
        System.out.println("Curso matriculado:");
        curso.exibirInformacoes();
        System.out.println("Semestre: " +semestre);
    }
}
