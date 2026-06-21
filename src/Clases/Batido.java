package Clases;

public class Batido extends Cafe {

    public Batido(String tamaño) {
        setDescripcion("Cafe Batido");
        setTamaño(tamaño);
    }

    public double costo() {
        if (getTamaño().equals("N")) {
            return 0.89;
        } else if (getTamaño().equals("M")) {
            return 0.99;
        } else if (getTamaño().equals("G")) {
            return 1.09;
        } else {
            return 0.89;
        }
    }
}