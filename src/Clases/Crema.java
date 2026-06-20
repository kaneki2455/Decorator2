package Clases;
public class Crema extends DecoradorComplemento {
    Cafe bebida;

    public Crema(Cafe bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    public double costo() {
        return 0.10 + bebida.costo();
    }
}