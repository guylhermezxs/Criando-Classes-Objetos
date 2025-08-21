package poo.aula3;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numerosPaginas;
    private double valorCompra;

    public Livro(String titulo, String autor, String isbn, int numerosPaginas, double valorCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numerosPaginas = numerosPaginas;
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Livro [" +
                "Titulo= " + titulo + '\'' +
                ", Autor= " + autor + '\'' +
                ", ISBN= " + isbn + '\'' +
                ", Números de Paginas= " + numerosPaginas +
                ", Valor de Compra= " + valorCompra +
                ']';
    }
}
