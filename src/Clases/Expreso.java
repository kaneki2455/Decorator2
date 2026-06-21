package Clases;

public class Expreso extends Cafe {

    public Expreso(String tamaño) {
        setDescripcion("Cafe Expreso");
        setTamaño(tamaño);
    }

    public double costo() {
        if (getTamaño().equals("N")) {
            return 1.99;
        } else if (getTamaño().equals("M")) {
            return 2.09;
        } else if (getTamaño().equals("G")) {
            return 2.15;
        } else {
            return 1.99;
        }
    }
}