package Clases;

public class TostadoNegro extends Cafe {

    public TostadoNegro(String tamaño) {
        setDescripcion("Cafe Tostado Negro");
        setTamaño(tamaño);
    }

    public double costo() {
        if (getTamaño().equals("N")) {
            return 0.99;
        } else if (getTamaño().equals("M")) {
            return 1.09;
        } else if (getTamaño().equals("G")) {
            return 1.19;
        } else {
            return 0.99;
        }
    }
}