package Clases;

public class leche extends DecoradorComplemento {
    private Cafe bebida;

    public leche(Cafe bebida) {
        this.bebida = bebida;
        setTamaño(bebida.getTamaño());
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    public double costo() {
        double precioLeche;
        if (bebida.getTamaño().equals("N")) {
            precioLeche = 0.10;
        } else if (bebida.getTamaño().equals("M")) {
            precioLeche = 0.15;
        } else if (bebida.getTamaño().equals("G")) {
            precioLeche = 0.20;
        } else {
            precioLeche = 0.10;
        }
        return precioLeche + bebida.costo();
    }
}