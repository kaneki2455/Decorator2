package Clases;

public class Soya extends DecoradorComplemento {
    Cafe bebida;

    public Soya(Cafe bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Soya";
    }

    public double costo() {
        return 0.15 + bebida.costo();
    }
}