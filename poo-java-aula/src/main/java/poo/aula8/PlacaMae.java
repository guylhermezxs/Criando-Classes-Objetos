package poo.aula8;

public class PlacaMae extends Especificacao {
    private String soquete;

    public PlacaMae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "Placa Mãe [" +
                "Marca = " + marca + '\'' +
                ", Modelo = " + modelo + '\'' +
                ", Soquete = " + soquete + '\'' +
                ']';
    }
}
