package exerciciouriaprender;

import java.util.Scanner;

public class Exercicio1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo, velocidade, distancia;
        double litros;
        tempo = sc.nextInt();
        velocidade = sc.nextInt();
        distancia = tempo * velocidade;

        litros = distancia * 1 / 12.00;

        System.out.printf("%.3f\n", litros);
    }
}
