package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1004 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, PROD;

        x = entrada.nextInt();
        y = entrada.nextInt();

        PROD = x * y;

        System.out.printf("PROD = %d\n", PROD);

    }
}
