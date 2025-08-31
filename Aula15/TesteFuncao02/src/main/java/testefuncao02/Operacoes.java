package testefuncao02;

public class Operacoes {

    public static String contador(int inicio, int fim, int passo) {

        String numero = "";

        for (int i = inicio; i <= fim; i += passo) {

            numero += i + " ";

        }

        return numero;

    }

}
