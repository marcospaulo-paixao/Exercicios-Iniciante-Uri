package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1011 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double R, VOLUME, Pi = 3.14159;

        R = entrada.nextDouble();
        VOLUME = (4.0 / 3.0) * (Pi * Math.pow(R, 3));

        System.out.printf("VOLUME = %.3f\n", VOLUME);
    }
}
