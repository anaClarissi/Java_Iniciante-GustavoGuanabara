import javax.swing.JOptionPane;

public class ExercicioRepitaSwing {

    public static void main(String[] args) {

        int numero;

        int soma = 0;

        int totalNumeros = 0;

        int totalNumeroPar = 0;

        int totalNumeroImpar = 0;

        int numeroAcimaCem = 0;

        int media;

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número(0 parar): "));

            soma += numero;

            totalNumeros++;

            if (numero % 2 == 0){

                totalNumeroPar++;

            } else {

                totalNumeroImpar++;

            }

            if (numero > 100){

                numeroAcimaCem++;

            }

            media = soma / totalNumeros;

        } while (numero != 0);

        String totalValores = "Total de valores: " + totalNumeros;
        String totaoValoresPares = "Total de Pares: " + totalNumeroPar;
        String totalValoresImpares = "Toal de Ímpares: " + totalNumeroImpar;
        String valoresAcimaDeCem = "Acima de 100: " + numeroAcimaCem;
        String mediaDosValores = "Média dos valores: " + media;

        JOptionPane.showMessageDialog(null, String.format("<html>Resultado:<hr> %s <br> %s <br> %s <br> %s <br> %s</html>", totalValores, totaoValoresPares, totalValoresImpares, valoresAcimaDeCem, mediaDosValores));

    }

}
