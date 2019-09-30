package exerciciouriaprender;
    
import java.util.Scanner;

public class Exercicio1013 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, C, ABS, MaiorAB, MAIOR;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();

        MaiorAB = (A + B + Math.abs(A - B)) / 2;

        MAIOR = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;

        System.out.printf("%d eh o maior\n", MAIOR);

    }

}
