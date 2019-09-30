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
public class Exercicio1014 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X;
        double Y, consumoMedio;

        X = entrada.nextInt();
        Y = entrada.nextDouble();

        consumoMedio = X / Y;
        System.out.printf("%.3f km/l\n", consumoMedio);

    }
}
