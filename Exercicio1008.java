package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1008 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int funcionario, horasTrab;
        double valorRecHora, salario;

        funcionario = entrada.nextInt();
        horasTrab = entrada.nextInt();
        valorRecHora = entrada.nextDouble();

        salario = horasTrab * valorRecHora;

        System.out.printf("NUMBER = %d\n", funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
