package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1037 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valorQualquer = entrada.nextFloat();

        if (valorQualquer >= 0 && valorQualquer <= 25.00) {
            System.out.printf("Intervalo [0,25]\n");

        } else if (valorQualquer >= 25.01 && valorQualquer <= 50.00) {
            System.out.printf("Intervalo (25,50]\n");

        } else if (valorQualquer >= 50.01 && valorQualquer <= 75.00) {
            System.out.printf("Intervalo (50,75]\n");

        } else if (valorQualquer >= 75.01 && valorQualquer <= 100.00) {
            System.out.printf("Intervalo (75,100]\n");

        } else {
            System.out.printf("Fora de intervalo\n");
        }

    }
}
