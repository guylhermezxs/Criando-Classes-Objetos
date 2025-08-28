package poo.aula5;

public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');

    private String sexo;
    private char sigla;

    Sexo(String sexo, char sigla) {
        this.sexo = sexo;
        this.sigla = sigla;
    }

    public String getSexo() {
        return sexo;
    }

    public char getSigla() {
        return sigla;
    }
}
