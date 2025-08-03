package org.example;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;

        float m = (n1 + n2) / 2f;

        System.out.printf("A média é igual a: %.1f\n",m);


        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);


        float v = 8.9f;

        System.out.println((int) Math.floor(v));
        System.out.println((int) Math.ceil(v));
        System.out.println((int) Math.round(v));


        double ale = Math.random();
        int n = (int) (1 + ale * (5 - 1));
        System.out.println(n);

    }
}
