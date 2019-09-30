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
public class Exercicio1041 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float x = entrada.nextFloat();
        float y = entrada.nextFloat();

        if (x == 0.0 && y == 0.0) {
            System.out.printf("Origem\n");

        } else if (y == 0) {
            
            System.out.println("Eixo X");
            
        } else if (x == 0) {
            
            System.out.println("Eixo Y");
            
        } else if (x >= 0.1 && y >= 0.1) {

            System.out.printf("Q1\n");

        } else if (x <= -0.1 && y >= 0.1) {

            System.out.printf("Q2\n");

        } else if (x <= -0.1 && y <= -0.1) {

            System.out.printf("Q3\n");

        } else if (x >= 0.1 && y <= -0.1) {

            System.out.printf("Q4\n");

        }
    }
}
