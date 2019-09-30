package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, SOMA;

        A = entrada.nextInt();
        B = entrada.nextInt();

        SOMA = A + B;

        System.out.printf("SOMA = %d\n", SOMA);
    }
}
