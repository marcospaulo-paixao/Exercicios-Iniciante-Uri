package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1043 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String isento = "Isento";
        float salario = entrada.nextFloat();

        double Imposto1 = ((salario - 2000) * 0.08);
        double Imposto2 = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
        double Imposto3 = ((1000.00 * 0.08) + (1500 * 0.18) + ((salario - 4500.00) * 0.28));

        if (salario >= 0.00 && salario <= 2000.00) {

            System.out.printf("%s\n", isento);

        } else if (salario >= 2000.01 && salario <= 3000.00) {

            System.out.printf("R$ %.2f\n", Imposto1);

        } else if (salario >= 3000.01 && salario <= 4500.00) {

            System.out.printf("R$ %.2f\n", Imposto2);

        } else if (salario > 4500.00) {

            System.out.printf("R$ %.2f\n", Imposto3);

        }

    }
}
