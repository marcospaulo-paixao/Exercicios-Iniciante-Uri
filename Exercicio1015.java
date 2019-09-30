package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1015 {

    public static void main(String[] args) {
        float x1, y1, x2, y2, pot1, pot2, dim1, dim2, somapot, raiz;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();

        dim1 = x2 - x1;
        dim2 = y2 - y1;
        pot1 = (float) Math.pow(dim1, 2);
        pot2 = (float) Math.pow(dim2, 2);
        somapot = pot1 + pot2;
        raiz = (float) Math.sqrt(somapot);
        System.out.printf("%.4f\n", raiz);

    }
}
