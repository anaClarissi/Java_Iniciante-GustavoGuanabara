package funcao01;

public class Fatorial {

    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";

    public void setValor(int n) {

        numero = n;

        int f = 1;

        String s = "";

        for (int i = n; i > 1; i--) {

            f *= i;

            s += i + " x ";

        }
        s += "1 = ";
        fatorial = f;
        formula = s;

    }

    public int getFatorial() {
        return fatorial;
    }

    public String getFormula() {
        return formula;
    }

}
