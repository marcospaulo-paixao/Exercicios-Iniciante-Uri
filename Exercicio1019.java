package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1019 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N, horas, minutos, minuto, hora, segundo;

        N = entrada.nextInt();

        segundo = N % 60;
        minutos = N / 60;
        minuto = minutos % 60;
        horas = minutos / 60;

        System.out.printf("%d:%d:%d\n", horas, minuto, segundo);

    }
}
