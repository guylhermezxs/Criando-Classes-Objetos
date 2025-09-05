package poo.aula15;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String genero;

    Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
