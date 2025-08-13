package org.exercicios;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String tipo;

        System.out.print("Quantas pernas: ");
        int pernas = in.nextInt();

        System.out.print("Isso é um(a): ");

        switch (pernas){

            case 1:
                tipo = "Saci";
                break;

            case 2:
                tipo = "Bípede";
                break;

            case 3:
                tipo = "Tripé";
                break;

            case 4:
                tipo = "Quadrúpide";
                break;

            case 6:
                tipo = "Inseto";
                break;

            case 8:
                tipo = "Aranha";
                break;

            default:
                tipo = "ET";
                break;

        }

        System.out.println(tipo);

    }

}
