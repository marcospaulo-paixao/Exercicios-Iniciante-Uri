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
public class Exercicio1040 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        int peso4 = 1;

        float N1 = entrada.nextFloat();
        float N2 = entrada.nextFloat();
        float N3 = entrada.nextFloat();
        float N4 = entrada.nextFloat();

        double media = ((peso1 * N1) + (peso2 * N2) + (peso3 * N3) + (peso4 * N4)) / (peso1 + peso2 + peso3 + peso4);

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {

            System.out.printf("Aluno aprovado.\n");

        } else if (media < 5.0) {

            System.out.printf("Aluno reprovado.\n");

        } else if (media >= 5.0 && media <= 6.9) {

            System.out.printf("Aluno em exame.\n");
            float notaDoExame = entrada.nextFloat();

            System.out.printf("Nota do exame: %.1f\n", notaDoExame);

            double recalc = (media + notaDoExame) / 2;

            if (recalc >= 5.0) {
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", recalc);

            } else if (recalc <= 4.9) {
                System.out.printf("Aluno reprovado.");

            }
        } else {
            System.out.printf("Nota invalida!!!\n");
        }

    }
}
