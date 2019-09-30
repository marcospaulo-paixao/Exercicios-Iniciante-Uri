package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1035 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valorA = "Valores aceitos";
        String valorB = "Valores nao aceitos";

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        if (B > C && D > A) {
            int soma1 = C + D;
            int soma2 = A + B;
            if (soma1 > soma2 && (D >= 0) && (C >= 0)) {
                System.out.printf("%s\n", valorA);

            } else {
                System.out.printf("%s\n", valorB);
            }

        } else {
            System.out.printf("%s\n", valorB);

        }

    }
}
