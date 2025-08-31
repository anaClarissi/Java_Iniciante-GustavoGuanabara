import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {

        int[] vetor = {2,3,4,7,54,8};

        for (int valor : vetor) {

            System.out.print(valor + " ");

        }

        System.out.println("");

        int posicao = Arrays.binarySearch(vetor, 3);

        System.out.println("Posição " + posicao);

    }

}
