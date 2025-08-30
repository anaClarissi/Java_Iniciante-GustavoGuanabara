import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, soma = 0;

        String resposta;

        do {

            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;

            System.out.print("Quer continuar? ");
            resposta = scanner.next();

        } while (resposta.equals("S"));

        System.out.printf("A soma de todos os valores é: %d", soma);

    }

}
