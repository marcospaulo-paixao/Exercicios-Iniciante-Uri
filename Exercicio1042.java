package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1042 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, aa, b, bb, c, cc, aux;

        a = aa = entrada.nextInt();
        b = bb = entrada.nextInt();
        c = cc = entrada.nextInt();

        if (b < a || c < a) {
            if (b < c) {
                aux = a;
                a = b;
                b = aux;
            } else {
                aux = a;
                a = c;
                c = aux;
            }
        }
        if (c < b) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.printf("%d\n", a);
        System.out.printf("%d\n", b);
        System.out.printf("%d\n\n", c);
        System.out.printf("%d\n", aa);
        System.out.printf("%d\n", bb);
        System.out.printf("%d\n", cc);
    }
}
