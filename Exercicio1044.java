/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciouriaprender;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Exercicio1044 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aux;
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        if (y > x) {

            aux = x;
            x = y;
            y = aux;

            double div = x / y;
            double result = x % y;

            if (result == 0) {

                System.out.printf("Sao Multiplos\n");

            } else {

                System.out.printf("Nao sao Multiplos\n");
            }

        } else {
            double div = x / y;
            double result = x % y;

            if (result == 0) {

                System.out.printf("Sao Multiplos\n");

            } else {

                System.out.printf("Nao sao Multiplos\n");
            }
        }

    }
}
