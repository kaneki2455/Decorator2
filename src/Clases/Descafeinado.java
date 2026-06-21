package Clases;

public class Descafeinado extends Cafe {

    public Descafeinado(String tamaño) {
        setDescripcion("Cafe Descafeinado");
        setTamaño(tamaño);
    }

    public double costo() {
        if (getTamaño().equals("N")) {
            return 1.05;
        } else if (getTamaño().equals("M")) {
            return 1.15;
        } else if (getTamaño().equals("G")) {
            return 1.25;
        } else {
            return 1.05;
        }
    }
}