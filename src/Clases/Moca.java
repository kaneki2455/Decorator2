package Clases;

public class Moca extends DecoradorComplemento {
    private Cafe bebida;

    public Moca(Cafe bebida) {
        this.bebida = bebida;
        setTamaño(bebida.getTamaño());
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Moca";
    }

    public double costo() {
        double precioMoca;
        if (bebida.getTamaño().equals("N")) {
            precioMoca = 0.20;
        } else if (bebida.getTamaño().equals("M")) {
            precioMoca = 0.25;
        } else if (bebida.getTamaño().equals("G")) {
            precioMoca = 0.30;
        } else {
            precioMoca = 0.20;
        }
        return precioMoca + bebida.costo();
    }
}