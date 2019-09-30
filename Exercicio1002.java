package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area, n;
        n = 3.14159;

        raio = entrada.nextDouble();

        area = Math.pow(raio, 2) * n;
        System.out.printf("A=%.4f\n", area);
    }

}
