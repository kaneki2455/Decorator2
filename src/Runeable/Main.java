package Runeable;

import java.util.Scanner;
import Clases.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO A CAFETERIA EL NEGRITO");
        System.out.println();

        System.out.println("Elija su cafe:");
        System.out.println("1. Expreso");
        System.out.println("2. Tostado Negro");
        System.out.println("3. Descafeinado");
        System.out.println("4. Batido");

        int opcionCafe = Integer.parseInt(sc.nextLine());

        System.out.println("Elija el tamaño (N = Normal, M = Mediano, G = Grande):");
        String tamaño = sc.nextLine().toUpperCase();

        Cafe bebida;

        if (opcionCafe == 1) {
            bebida = new Expreso(tamaño);
        } else if (opcionCafe == 2) {
            bebida = new TostadoNegro(tamaño);
        } else if (opcionCafe == 3) {
            bebida = new Descafeinado(tamaño);
        } else {
            bebida = new Batido(tamaño);
        }

        System.out.println("Cuantas Leches desea? (0,1,2...)");
        int leche = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < leche; i++) {
            bebida = new leche(bebida);
        }

        System.out.println("Cuantas Mocas desea? (0,1,2...)");
        int moca = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < moca; i++) {
            bebida = new Moca(bebida);
        }

        System.out.println("Cuantas Soyas desea? (0,1,2...)");
        int soya = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soya; i++) {
            bebida = new Soya(bebida);
        }


        System.out.println("Cuantas Cremas desea? (0,1,2...)");
        int crema = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < crema; i++) {
            bebida = new Crema(bebida);
        }

        System.out.println();
        System.out.println("Su orden: " + bebida.getDescripcion());
        System.out.println("Total: $" + bebida.costo());

        sc.close();
    }
}