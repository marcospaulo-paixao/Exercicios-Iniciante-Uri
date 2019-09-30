package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1005 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y, peso1 = 3.5, peso2 = 7.5, MEDIA;

        x = entrada.nextDouble();
        y = entrada.nextDouble();

        MEDIA = (x * peso1 + y * peso2) / (peso1 + peso2);

        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }
}
