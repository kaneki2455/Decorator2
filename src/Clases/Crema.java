package Clases;

public class Crema extends DecoradorComplemento {
    private Cafe bebida;

    public Crema(Cafe bebida) {
        this.bebida = bebida;
        setTamaño(bebida.getTamaño());
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    public double costo() {
        double precioCrema;
        if (bebida.getTamaño().equals("N")) {
            precioCrema = 0.10;
        } else if (bebida.getTamaño().equals("M")) {
            precioCrema = 0.15;
        } else if (bebida.getTamaño().equals("G")) {
            precioCrema = 0.20;
        } else {
            precioCrema = 0.10;
        }
        return precioCrema + bebida.costo();
    }
}