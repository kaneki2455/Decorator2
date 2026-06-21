package Clases;

public class Soya extends DecoradorComplemento {
    private Cafe bebida;

    public Soya(Cafe bebida) {
        this.bebida = bebida;
        setTamaño(bebida.getTamaño());
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Soya";
    }

    public double costo() {
        double precioSoya;
        if (bebida.getTamaño().equals("N")) {
            precioSoya = 0.15;
        } else if (bebida.getTamaño().equals("M")) {
            precioSoya = 0.20;
        } else if (bebida.getTamaño().equals("G")) {
            precioSoya = 0.25;
        } else {
            precioSoya = 0.15;
        }
        return precioSoya + bebida.costo();
    }
}