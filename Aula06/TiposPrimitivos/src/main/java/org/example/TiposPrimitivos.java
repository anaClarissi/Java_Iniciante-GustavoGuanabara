package org.example;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();

        System.out.printf("Digite a sua nota %s: ", nome);
        float nota = in.nextFloat();

        System.out.format("A nota de %s é: %.1f", nome, nota);

    }
}
