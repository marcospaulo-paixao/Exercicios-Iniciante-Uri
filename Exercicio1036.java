package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1036 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String calIn = "Impossivel calcular";

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        double Δ = Math.pow(B, 2) - (4 * A * C);

        if (A == 0.0) {
            System.out.printf("%s\n", calIn);
        } else if (Δ < 0) {
            System.out.printf("%s\n", calIn);
        } else {
            double R1 = ((B * -1) + Math.sqrt(Δ)) / (2 * A);
            double R2 = ((B * -1) - Math.sqrt(Δ)) / (2 * A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }

    }
}
