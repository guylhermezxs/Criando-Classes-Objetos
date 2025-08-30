package poo.aula8;

public class DispositivoDeArmazenamento extends Especificacao{
    private String capacidadeDeArmazenamento;
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidadeDeArmazenamento, String tipoDeConexao) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "Dispositivo De Armazenamento [" +
                "Marca = " + marca + '\'' +
                ", Modelo = " + modelo + '\'' +
                ", Capacidade De Armazenamento = " + capacidadeDeArmazenamento + '\'' +
                ", Tipo De Conexão = " + tipoDeConexao + '\'' +
                ']';
    }
}
