package org.exercicios;

import java.time.Year;
import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Em que ano você nasceu? ");
        int nascimentoDoUsuario = in.nextInt();


        int idadeDoUsuario = Year.now().getValue() - nascimentoDoUsuario;

        System.out.printf("Sua idade é: %d\n", idadeDoUsuario);

        if (idadeDoUsuario >= 18){

            System.out.println("Maior de Idade");

        } else {

            System.out.println("Menor de Idade");

        }

    }

}
