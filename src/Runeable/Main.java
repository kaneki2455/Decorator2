package Runiable;

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
        switch (opcionCafe) {
            case 1:
                bebida = new Expreso(tamaño);
                break;
            case 2:
                bebida = new TostadoNegro(tamaño);
                break;
            case 3:
                bebida = new Descafeinado(tamaño);
                break;
            case 4:
                bebida = new Batido(tamaño);
                break;
            default:
                bebida = new Expreso(tamaño);
        }

        String respuesta;

        System.out.println("¿Desea agregar Leche? (S/N)");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            bebida = new leche(bebida);
        }

        System.out.println("¿Desea agregar Moca? (S/N)");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            bebida = new Moca(bebida);
        }

        System.out.println("¿Desea agregar Soya? (S/N)");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            bebida = new Soya(bebida);
        }

        System.out.println("¿Desea agregar Crema? (S/N)");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            bebida = new Crema(bebida);
        }

        System.out.println();
        System.out.println("Su orden: " + bebida.getDescripcion());
        System.out.println("Total: $" + bebida.costo());

        sc.close();
    }
}