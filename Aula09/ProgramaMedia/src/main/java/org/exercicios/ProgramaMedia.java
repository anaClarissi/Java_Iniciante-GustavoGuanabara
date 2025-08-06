package org.exercicios;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Sua primeira nota: ");
        float primeiraNotaDoUsuario = in.nextFloat();

        System.out.print("Sua segunda nota: ");
        float segundaNotaDoUsuario = in.nextFloat();

        float mediaDoUsuario = (primeiraNotaDoUsuario + segundaNotaDoUsuario) / 2;

        System.out.printf("Sua média é: %.1f", mediaDoUsuario);

        if (mediaDoUsuario > 9){

            System.out.println("Parabenz!");

        }

    }

}
