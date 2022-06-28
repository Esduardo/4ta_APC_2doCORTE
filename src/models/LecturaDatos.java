package models;

import java.util.Scanner;

public class LecturaDatos{
    static private double longitudRadio;
    static Scanner entrada = new Scanner(System.in);
    public static void lectura(){
        System.out.println("||               PRACTICA 4              ||" +
                        "\n||      Calcular volumende una esfera     ||" +
                        "\n||      Longitud de radio de la esfera?   ||");
        System.out.printf("||                   >> ");
        longitudRadio = entrada.nextDouble();
    }

    public static double getLongitudRadio() {
        return longitudRadio;
    }
}
