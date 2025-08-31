import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {

        double[] precos = {8.5, 4.6, 7.9, -4.7};

        Arrays.sort(precos);

        for (double valores : precos){

            System.out.println(valores);

        }

    }

}
