package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n100, n50, n20, n10, n5, n2, m1;
        int m50, m25, m10, m5, m01;
        double notasRes1;
        int notasRes2;
        int notas;
        int moedas;

        float N = entrada.nextFloat();

        notasRes2 = (int) N;
        notasRes1 = notasRes2 * 100;        
        notas = (int) (N * 100);
        moedas = (int) ((int) notas - notasRes1);

        n100 = (int) (N / 100);
        N %= 100;
        n50 = (int) N / 50;
        N %= 50;
        n20 = (int) N / 20;
        N %= 20;
        n10 = (int) N / 10;
        N %= 10;
        n5 = (int) N / 5;
        N %= 5;
        n2 = (int) N / 2;
        N %= 2;
        m1 = (int) N / 1;
        N %= 1;
        
        m50 = (moedas / 50);
        moedas %= 50;
        m25 = (moedas / 25);
        moedas %= 25;
        m10 = (moedas / 10);
        moedas %= 10;
        m5 = (moedas / 5);
        moedas %= 5;
        m01 = (moedas / 1);
        moedas %= 1;

        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", n100);
        System.out.printf("%d nota(s) de R$ 50.00\n", n50);
        System.out.printf("%d nota(s) de R$ 20.00\n", n20);
        System.out.printf("%d nota(s) de R$ 10.00\n", n10);
        System.out.printf("%d nota(s) de R$ 5.00\n", n5);
        System.out.printf("%d nota(s) de R$ 2.00\n", n2);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", m1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", m50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", m25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", m10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", m5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", m01);
    }
}
