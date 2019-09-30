package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1010 {

    public static void main(String[] args) {

        int codigo1, numero1, codigo2, numero2;
        double valor1, valor2, valor_a_pagar;
        Scanner sc = new Scanner(System.in);

        codigo1 = sc.nextInt();
        numero1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        numero2 = sc.nextInt();
        valor2 = sc.nextDouble();

        valor_a_pagar = (numero1 * valor1) + (numero2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_a_pagar);
    }

}
