package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1038 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cod, quantidade;
        double total = 0;

        cod = entrada.nextInt();
        quantidade = entrada.nextInt();

        if (cod == 1) {
            total += 4.0 * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (cod == 2) {
            total += 4.5 * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (cod == 3) {
            total += 5.00 * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (cod == 4) {
            total += 2.00 * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (cod == 5) {
            total += 1.50 * quantidade;
            System.out.printf("Total: R$ %.2f\n", total);
        } else {

        }

    }
}
