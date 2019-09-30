package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1043 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float A = entrada.nextFloat();
        float B = entrada.nextFloat();
        float C = entrada.nextFloat();

        float res1, res2, res3;
        float area = (float) (((A + B) * C) / (2.0));
        float perimetro = A + B + C;
        if (B - C < 0) {

            res1 = C - B;
        } else {
            res1 = B - C;
        }
        if (B - A < 0) {
            res2 = A - B;
        } else {
            res2 = B - A;
        }
        if (C - A < 0) {
            res3 = A - C;
        } else {
            res3 = C - A;
        }
        if ((res1 < A) && (A < (B + C)) && (res2 < C) && (C < (A + B)) && (res3 < B) && (B < (A + C))) {
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {

            System.out.printf("Area = %.1f\n", area);
        }

    }
}
