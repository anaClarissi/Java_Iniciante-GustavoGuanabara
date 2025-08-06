package org.example;

public class ComparacaoString {

    public static void main(String[] args){

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");

        String resultado;

        resultado = (nome1.equals(nome3)) ? "Igual":"Diferente";

        System.out.println(resultado);

    }

}
