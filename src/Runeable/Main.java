package Runeable;

import Clases.Cafe;
import Clases.Expreso;
import Clases.TostadoNegro;
import Clases.Descafeinado;
import Clases.Batido;
import Clases.leche;
import Clases.Moca;
import Clases.Soya;
import Clases.Crema;

public class Main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A CAFETERIA NEGRITO");
        System.out.println();

        Cafe bebidaA = new Expreso();
        bebidaA = new leche(bebidaA);
        bebidaA = new Soya(bebidaA);
        bebidaA = new Crema(bebidaA);
        bebidaA = new Moca(bebidaA);
        System.out.println("Su orden: " + bebidaA.getDescripcion()
                + "\nTotal: $" + bebidaA.costo());
        System.out.println();

        Cafe bebidaB = new Descafeinado();
        bebidaB = new Moca(bebidaB);
        bebidaB = new Moca(bebidaB);
        bebidaB = new Soya(bebidaB);
        bebidaB = new leche(bebidaB);
        System.out.println("Su orden: " + bebidaB.getDescripcion()
                + "\nTotal: $" + bebidaB.costo());
        System.out.println();

        Cafe bebidaC = new Batido();
        bebidaC = new Crema(bebidaC);
        bebidaC = new Crema(bebidaC);
        bebidaC = new leche(bebidaC);
        bebidaC = new leche(bebidaC);
        bebidaC = new Soya(bebidaC);
        bebidaC = new Soya(bebidaC);
        bebidaC = new Moca(bebidaC);
        bebidaC = new Moca(bebidaC);
        System.out.println("Su orden: " + bebidaC.getDescripcion()
                + "\nTotal: $" + bebidaC.costo());
        System.out.println();

        Cafe bebidaD = new TostadoNegro();
        bebidaD = new Crema(bebidaD);
        bebidaD = new Crema(bebidaD);
        bebidaD = new Soya(bebidaD);
        bebidaD = new Soya(bebidaD);
        bebidaD = new Soya(bebidaD);
        System.out.println("Su orden: " + bebidaD.getDescripcion()
                + "\nTotal: $" + bebidaD.costo());
    }
}