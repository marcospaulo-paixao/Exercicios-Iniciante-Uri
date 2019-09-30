package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1006 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C, pesoA = 2, pesoB = 3, pesoC = 5, MEDIA;

        A = entrada.nextDouble();
        if (A >= 0 && A <= 10.0) {

            B = entrada.nextDouble();
            if (B >= 0 && B <= 10.0) {
                C = entrada.nextDouble();
                if (C >= 0 && C <= 10.0) {

                    MEDIA = ((pesoA * A) + (pesoB * B) + (pesoC * C)) / (pesoA + pesoB + pesoC);
                    System.out.printf("MEDIA = %.1f\n", MEDIA);
                }
            }
        }

    }
}
